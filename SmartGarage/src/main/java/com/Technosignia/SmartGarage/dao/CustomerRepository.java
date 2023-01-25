package com.Technosignia.SmartGarage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Technosignia.SmartGarage.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer , Long> {


} 
