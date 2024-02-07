package com.teachmeskills.lesson8.run;

import com.teachmeskills.lesson8.patient.Patient;
import com.teachmeskills.lesson8.staff.impl.Therapist;

/**
 * Create the Runner class
 * Create 3 patient object
 * Create 1 Therapist object
 * Call the appointDoctor method of the therapist object with the input parameters Patient
 */
public class Runner {
    public static void main(String[] args) {
        Patient patient1 = new Patient("A", 1);
        Patient patient2 = new Patient("B", 2);
        Patient patient3 = new Patient("C", 3);

        Therapist therapist = new Therapist();

        therapist.appointDoctor(patient1);
        therapist.appointDoctor(patient2);
        therapist.appointDoctor(patient3);
    }
}
