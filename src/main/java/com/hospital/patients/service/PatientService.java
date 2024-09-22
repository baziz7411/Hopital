package com.hospital.patients.service;

import com.hospital.patients.model.PatientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PatientService {

    @Autowired
    private PatientModel patientModel;

    public String printName(String name){
        String n = patientModel.getNames()
                .stream()
                .filter(i->i == name)
                .findAny()
                .orElse("Nothing");

return n.toUpperCase();
    }
}
