package com.jsp.patientappointmentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.patientappointmentsystem.model.Medication;

public interface MedicationRepository extends JpaRepository<Medication, Long> {
	
}

