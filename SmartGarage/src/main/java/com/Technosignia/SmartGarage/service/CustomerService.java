package com.Technosignia.SmartGarage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.SmartGarage.dao.CustomerRepository;
import com.Technosignia.SmartGarage.entity.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public Customer createCustomer(Customer cust)
	{
		return customerRepository.save(cust);
	}
	
	public Optional<Customer> getCustomerByID(Long id) {
	 
		Optional<Customer> opCust= customerRepository.findById(id);
			return opCust;
	
	}

	public Customer updateCustomerDetailsById(Long id, Customer cust) {
	Optional<Customer> dbOPCust = customerRepository.findById(id);
	Customer dbCust = dbOPCust.get();
	dbCust.setAddress(cust.getAddress());
	dbCust.setContact(cust.getContact());
	
	return customerRepository.save(dbCust);
 }
	public String deleteCustomerById(Long id) {
	Optional<Customer> dbOPCust = customerRepository.findById(id);
	if(dbOPCust.isPresent()) {
		
	customerRepository.deleteById(id);
	return "A record delete successfully !!";
	}else {
	return "A record already deleted!!!";
}
}
}
