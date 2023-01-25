package com.Technosignia.SmartGarage.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.SmartGarage.entity.Fault;
import com.Technosignia.SmartGarage.service.FaultService;


@RestController
public class FaultController {

	@Autowired
	FaultService faultService;
	
	@PostMapping("/fault")
	public Fault createFault(@RequestBody Fault fault) {
	return faultService.createFault(fault);
	}
	@GetMapping("/fault")
		public Optional<Fault> findFaultById(@RequestParam Long id)
		{
		return faultService.getFaultById(id);
	}
	@PutMapping("/fault/{id}")
	public Fault updateFaultDetailsById(@PathVariable Long id,@RequestBody Fault fault) 
	{
		return faultService.updateFaultDetails(id,fault);
	}
	@DeleteMapping("/fault/{id}")
	public String deleteFaultById(@PathVariable Long id) {
	return faultService.deleteFaultById(id);
}
}