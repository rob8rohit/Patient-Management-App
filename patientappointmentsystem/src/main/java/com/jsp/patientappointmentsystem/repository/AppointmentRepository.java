package com.jsp.patientappointmentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.patientappointmentsystem.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
	
}

