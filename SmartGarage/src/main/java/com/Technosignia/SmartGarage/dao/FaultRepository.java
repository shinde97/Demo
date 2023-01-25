package com.Technosignia.SmartGarage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Technosignia.SmartGarage.entity.Fault;

@Repository
public interface FaultRepository extends JpaRepository<Fault, Long> {

}
