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

import com.Technosignia.SmartGarage.entity.Vehicle;
import com.Technosignia.SmartGarage.service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	VehicleService vehicleService;
	
	@PostMapping("/vehicle")
	public Vehicle createVehicle(@RequestBody Vehicle vehicle)
	{
		return vehicleService.createVehicle(vehicle);
	}
	
	@GetMapping("/vehicle")
	public Optional<Vehicle> getVehicleById(@RequestParam Long id){
		return vehicleService.getVehicleById(id);
	}
	@PutMapping("/vehicle/{id}")
	public Vehicle updateVehicleDetailsById(@PathVariable Long id, @RequestBody Vehicle vehicle)
	{
		return vehicleService.updateVehicleDetailsById(id,vehicle);
	}
	@DeleteMapping("/vehicle/{id}")
	public String deleteVehicleById(@PathVariable Long id)
	{
		return vehicleService.deleteVehicleById(id);
	}
	
}
