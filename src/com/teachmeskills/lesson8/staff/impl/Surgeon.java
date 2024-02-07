package com.teachmeskills.lesson8.staff.impl;

import com.teachmeskills.lesson8.patient.Patient;
import com.teachmeskills.lesson8.staff.HospitalStaff;

/**
 * Create the Surgeon class,
 * which extends the HospitalStaff class
 * Extends method treat
 */
public class Surgeon extends HospitalStaff {

    @Override
    public void treat(Patient patientData) {
        System.out.println("Patient name " + patientData.namePatient +
                ", he's been referred to a surgeon for surgery.");
    }
}
