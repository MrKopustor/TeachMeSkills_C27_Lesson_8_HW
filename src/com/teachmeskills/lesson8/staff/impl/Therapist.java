package com.teachmeskills.lesson8.staff.impl;

import com.teachmeskills.lesson8.patient.Patient;
import com.teachmeskills.lesson8.staff.HospitalStaff;

/**
 * Create the Therapist class,
 * which extends the HospitalStaff class
 * Extends method treat
 * Create method appointDoctor
 */
public class Therapist extends HospitalStaff {

    @Override
    public void treat(Patient patientData) {
        System.out.println("Patient name " + patientData.namePatient +
                ", has been referred for a follow-up appointment with The Therapist." );
    }

    public void appointDoctor(Patient patientData) {
        if (patientData.getTreatmentPlan() == 1) {
            patientData.setDoctor(new Surgeon());
        } else if (patientData.getTreatmentPlan() == 2){
            patientData.setDoctor(new Dentist());
        } else {
            patientData.setDoctor(new Therapist());
        }

        patientData.getDoctor().treat(patientData);
    }
}