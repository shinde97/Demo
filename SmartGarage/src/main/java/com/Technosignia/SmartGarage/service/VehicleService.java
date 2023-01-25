package com.Technosignia.SmartGarage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.SmartGarage.dao.VehicleRepository;
import com.Technosignia.SmartGarage.entity.Vehicle;

@Service
public class VehicleService {
	@Autowired
	VehicleRepository vehicleRepository;

	public Vehicle createVehicle(Vehicle vehicle) 
	{
		return vehicleRepository.save(vehicle);
	}
	
	public Optional<Vehicle> getVehicleById(Long id)
	{
		Optional<Vehicle> opVehicle = vehicleRepository.findById(id);
				return opVehicle;
	}
	
	public Vehicle updateVehicleDetailsById(Long id, Vehicle vehicle) {
	Optional<Vehicle> dbopVehicle= vehicleRepository.findById(id);
	Vehicle dbvehicle= dbopVehicle.get();
	
	dbvehicle.setVehiclename(vehicle.getVehiclename());
	dbvehicle.setVehicleno(vehicle.getVehicleno());
	
	return vehicleRepository.save(vehicle);
}

	public String deleteVehicleById(Long id) {
		Optional<Vehicle> dbopVehicle = vehicleRepository.findById(id);
		if(dbopVehicle.isPresent())
		{
			vehicleRepository.deleteById(id);
			return "A record is delete Successfully!!";
		}else {
			return " A record Already Deleted";
		}
	}
}