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
import com.Technosignia.SmartGarage.entity.Mechanic;
import com.Technosignia.SmartGarage.service.MechanicService;

@RestController
public class MechanicController {

	@Autowired
		MechanicService mechanicService;
		
		@PostMapping("/mechanic")
		public Mechanic createMechanic(@RequestBody Mechanic mech) {
			return mechanicService.createMechanic(mech);
		}
		
		@GetMapping("/mechanic")
		public Optional <Mechanic> findMechanicById(@RequestParam Long id)
		{
			return mechanicService.getMechanicById(id);
		}
		
		@PutMapping("/mechanic/{id}")
		public Mechanic updateCustomerDetailsById(@PathVariable Long id, @RequestBody Mechanic mech) {

			return mechanicService.updateMechanicDetailsById(id,mech);
		}

		@DeleteMapping("/mechanic/{id}")
		public String  deleteMechanicById(@PathVariable Long id) {
		return mechanicService.deleteMechanicById(id);
		}
}
