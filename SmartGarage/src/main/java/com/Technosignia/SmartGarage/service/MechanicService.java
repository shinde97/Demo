package com.Technosignia.SmartGarage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.SmartGarage.dao.MechanicRepository;
import com.Technosignia.SmartGarage.entity.Mechanic;

@Service
public class MechanicService {
	
	@Autowired
	MechanicRepository mechanicRepository;

	public Mechanic createMechanic(Mechanic mech) {
		return mechanicRepository.save(mech);
	}

	public Optional<Mechanic> getMechanicById(Long id) {
		Optional<Mechanic> opmech = mechanicRepository.findById(id);
		 return opmech;
	}
	public Mechanic updateMechanicDetailsById(Long id, Mechanic mech) {
		Optional<Mechanic> dbOPmech = mechanicRepository.findById(id);
		Mechanic dbmech = dbOPmech.get();
		dbmech.setAddress(mech.getAddress());
		dbmech.setContact(mech.getContact());
		
		return mechanicRepository.save(dbmech);
	 }

	public String deleteMechanicById(Long id) {
		Optional<Mechanic> dbOPCust = mechanicRepository.findById(id);
		if(dbOPCust.isPresent()) {
			
		mechanicRepository.deleteById(id);
		return "A record delete successfully !!";
	}else {
		return "A record already deleted!!!";
	}	

	}
}