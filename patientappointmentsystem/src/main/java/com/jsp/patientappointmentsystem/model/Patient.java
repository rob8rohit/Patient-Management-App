package com.jsp.patientappointmentsystem.model;

import jakarta.persistence.*;

@Entity
public class Patient {
	 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String contact;
	    private String medicalHistory;
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getMedicalHistory() {
			return medicalHistory;
		}
		public void setMedicalHistory(String medicalHistory) {
			this.medicalHistory = medicalHistory;
		}
		@Override
		public String toString() {
			return "Patient [id=" + id + ", name=" + name + ", contact=" + contact + ", medicalHistory="
					+ medicalHistory + "]";
		}
}
