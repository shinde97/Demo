package com.Technosignia.SmartGarage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.SmartGarage.dao.JobcardRepository;
import com.Technosignia.SmartGarage.entity.Jobcard;
@Service
public class JobcardService {
	
	@Autowired
JobcardRepository jobcardRepository;
	
	public Jobcard createJobcard(Jobcard job) {
		return jobcardRepository.save(job);
	}
	public Optional<Jobcard> getJobcardById(Long id) {
	 Optional<Jobcard> OpJobcard = jobcardRepository.findById(id);
		
		return OpJobcard;
	}
	public Jobcard updateJobcardById(Long id, Jobcard job) {
		Optional<Jobcard> dbOpJobcard = jobcardRepository.findById(id);
		Jobcard OpJobcard = dbOpJobcard.get();
		
		return jobcardRepository.save(OpJobcard);
			}
	public String deleteJobcardById(Long id) {
		Optional<Jobcard> dbOpJobcard=jobcardRepository.findById(id);
		if(dbOpJobcard.isPresent()){
		jobcardRepository.deleteById(id);
		return " A record is delete successfully";
		}else {
		return	" A record is already deleted";
		}
	}

}