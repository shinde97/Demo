package com.Technosignia.SmartGarage.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fault {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
 
 private String f_no;
 
 private String description;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getF_no() {
	return f_no;
}

public void setF_no(String f_no) {
	this.f_no = f_no;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}


}
	

