package com.jsp.patientappointmentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.patientappointmentsystem.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
	
}

