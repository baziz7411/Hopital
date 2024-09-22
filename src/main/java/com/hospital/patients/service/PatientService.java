package com.hospital.patients.service;

import com.hospital.patients.model.PatientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientModel patientModel;

    public String printName(String name){
        return patientModel.getPatientFromDatabase().toUpperCase();
    }
}
