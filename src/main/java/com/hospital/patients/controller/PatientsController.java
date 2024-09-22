package com.hospital.patients.controller;


import com.hospital.patients.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientsController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/name_patient")
    public String printPtientsName(){
        return patientService.printName("baziz");
    }

}
