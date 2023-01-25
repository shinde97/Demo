package com.Technosignia.SmartGarage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Technosignia.SmartGarage.entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle , Long>{

}
