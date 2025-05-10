package com.jsp.patientappointmentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.patientappointmentsystem.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> 
{
	}

