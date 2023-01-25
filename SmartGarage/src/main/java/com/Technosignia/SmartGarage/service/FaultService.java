package com.Technosignia.SmartGarage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.SmartGarage.dao.FaultRepository;
import com.Technosignia.SmartGarage.entity.Fault;

@Service
public class FaultService {

	@Autowired
	FaultRepository faultRepository;
	public Fault createFault(Fault fault) {
		return faultRepository.save(fault);

}
	public Optional<Fault> getFaultById(Long id) {
		Optional<Fault> opFault =faultRepository.findById(id);
		return opFault;
	}
	public Fault updateFaultDetails(Long id, Fault fault) {
		Optional<Fault> dbOPFault =faultRepository.findById(id);

		Fault dbfault = dbOPFault.get();
		dbfault.setF_no(fault.getF_no());
		dbfault.setDescription(fault.getDescription());
		return  faultRepository.save(dbfault);
	}
	public String deleteFaultById(Long id) {
		Optional<Fault> dbOPfault = faultRepository.findById(id);
		if(dbOPfault.isPresent()){
			
			faultRepository.deleteById(id);
			return "A record delete successfully !!";
		}else {
			return "A record already delected!!";
		}
	}
}

