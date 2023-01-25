package com.Technosignia.SmartGarage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Technosignia.SmartGarage.entity.Jobcard;

@Repository
public interface JobcardRepository extends JpaRepository<Jobcard, Long> {

}
