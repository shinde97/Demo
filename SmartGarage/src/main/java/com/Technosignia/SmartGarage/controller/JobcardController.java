package com.Technosignia.SmartGarage.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.SmartGarage.entity.Jobcard;
import com.Technosignia.SmartGarage.service.JobcardService;


@RestController
public class JobcardController {

	@Autowired
	JobcardService jobcardService;
	
	@PostMapping("/jobcard")
	public Jobcard createJobcard(@RequestBody Jobcard job)
	{
		return jobcardService.createJobcard(job);
	}
	@GetMapping("/jobcard")
	public Optional<Jobcard> findJobcardById(@RequestBody Long id){
		return jobcardService.getJobcardById(id);
	}
	@PutMapping("/jobcard/{id}")
	public Jobcard updateJobcardDetailsById(@PathVariable Long id ,@RequestBody Jobcard job ) {
	return jobcardService.updateJobcardById(id,job);
}
	@DeleteMapping("/jobcard/{id}")
	public String DeleteJobcardById(@PathVariable Long id)
	{
		return jobcardService.deleteJobcardById(id);
	}
}