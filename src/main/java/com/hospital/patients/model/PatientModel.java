package com.hospital.patients.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PatientModel {


    List<String> names = new ArrayList<>();

    //Constructeur
    PatientModel(){
        names.add("baziz");
        names.add("halim");
        names.add("nabila");
    }



    public String getPatientFromDatabase(){
        return names.get(0);
    }
}
