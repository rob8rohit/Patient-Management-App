package com.jsp.patientappointmentsystem.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
public class Appointment {
	 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	   @ManyToOne
	    private Patient patient;

	    @ManyToOne
	    private Doctor doctor;
        
	    @Column(name = "appointment_time", columnDefinition = "DATETIME")
	    private LocalDateTime appointmentTime;
	    private String status;
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Patient getPatient() {
			return patient;
		}
		public void setPatient(Patient patient) {
			this.patient = patient;
		}
		public Doctor getDoctor() {
			return doctor;
		}
		public void setDoctor(Doctor doctor) {
			this.doctor = doctor;
		}
		public LocalDateTime getAppointmentTime() {
			return appointmentTime;
		}
		public void setAppointmentTime(LocalDateTime appointmentTime) {
			this.appointmentTime = appointmentTime;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "Appointment [id=" + id + ", appointmentTime=" + appointmentTime + ", status=" + status + "]";
		}
}
