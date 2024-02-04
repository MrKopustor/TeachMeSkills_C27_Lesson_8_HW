package com.teachmeskills.lesson8.run;

import com.teachmeskills.lesson8.patient.Patient;
import com.teachmeskills.lesson8.staff.ext.Dentist;
import com.teachmeskills.lesson8.staff.ext.Surgeon;
import com.teachmeskills.lesson8.staff.ext.Therapist;

public class Runner {
    public static void main(String[] args) {
        int posit = 2;
        Patient patient1 = new Patient(posit, "dantics");
        Patient patient2 = new Patient(3, "dantics");

        Dentist dentist1 = new Dentist(2);
        Therapist therapist1 = new Therapist(3);
        Surgeon surgeon1 = new Surgeon(1);
    }
}
