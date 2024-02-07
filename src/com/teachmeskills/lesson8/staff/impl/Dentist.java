package com.teachmeskills.lesson8.staff.impl;

import com.teachmeskills.lesson8.patient.Patient;
import com.teachmeskills.lesson8.staff.HospitalStaff;

/**
 * Create the Dentist class,
 * which extends the HospitalStaff class
 * Extends method treat
 */
public class Dentist extends HospitalStaff {

    @Override
    public void treat(Patient patientData) {
        System.out.println("Patient name " + patientData.namePatient +
                ", sent to see Dentist.");
    }
}
