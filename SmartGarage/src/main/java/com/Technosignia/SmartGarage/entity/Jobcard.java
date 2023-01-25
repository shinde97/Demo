package com.Technosignia.SmartGarage.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Jobcard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 Long Id;
	
	 String jc_no;
	@CreatedDate
	private Date createTime;
	@LastModifiedDate
	private Date LastmodifiedTime;
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;	
	}

	public Date getLastmodifiedTime() {
		return LastmodifiedTime;
	}

	public void setLastmodifiedTime(Date lastmodifiedTime) {
		LastmodifiedTime = lastmodifiedTime;
	}

	
	@OneToMany
	List<Fault> faults;
	
	@OneToOne
	Customer customer;
	
	@OneToOne
	Vehicle vehicle;
	
	@OneToOne
	Mechanic mechanic;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getJc_no() {
		return jc_no;
	}

	public void setJc_no(String jc_no) {
		this.jc_no = jc_no;
	}

	public List<Fault> getFaults() {
		return faults;
	}

	public void setFaults(List<Fault> faults) {
		this.faults = faults;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Mechanic getMechanic() {
		return mechanic;
	}

	public void setMechanic(Mechanic mechanic) {
		this.mechanic = mechanic;
	}

}
