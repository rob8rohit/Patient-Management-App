package com.jsp.patientappointmentsystem.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.patientappointmentsystem.model.Medication;
import com.jsp.patientappointmentsystem.repository.MedicationRepository;

@RestController
@RequestMapping("/api/medications")
public class MedicationController {

    @Autowired
    private MedicationRepository medicationRepository;

    @PostMapping("/add")
    public ResponseEntity<Medication> addMedication(@RequestBody Medication medication) {
        return new ResponseEntity<>(medicationRepository.save(medication), HttpStatus.CREATED);
    }

    @GetMapping("/patient/{id}")
    public List<Medication> getMedicationsByPatient(@PathVariable Long id) {
        return medicationRepository.findAll()
                .stream()
                .filter(m -> m.getPatient().getId().equals(id))
                .collect(Collectors.toList());
    }
}
