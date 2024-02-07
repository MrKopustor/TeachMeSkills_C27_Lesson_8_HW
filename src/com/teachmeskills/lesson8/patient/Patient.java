package com.teachmeskills.lesson8.patient;

import com.teachmeskills.lesson8.staff.HospitalStaff;

/**
 * Create class Patient
 * Create patient fields
 * Create constructor with patient fields
 * Create Getter and Setter with patient fields
 */
public class Patient {

    public int treatmentPlan;
    public String namePatient;
    public HospitalStaff doctor;

    public Patient(String namePatient, int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
        this.namePatient = namePatient;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public String getNamePatient() {
        String n = "Patient" + namePatient;
        return n;
    }

    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }

    public HospitalStaff getDoctor() {
        return doctor;
    }

    public void setDoctor(HospitalStaff doctor) {
        this.doctor = doctor;
    }
}
