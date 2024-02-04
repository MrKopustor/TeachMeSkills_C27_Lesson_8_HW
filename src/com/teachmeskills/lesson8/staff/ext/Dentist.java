package com.teachmeskills.lesson8.staff.ext;

import com.teachmeskills.lesson8.staff.HospitalStaff;

public class Dentist extends HospitalStaff {

    public Dentist(int treatmentPlanCode) {
        super(treatmentPlanCode);
    }

    @Override
    public void treat() {
        System.out.println("Heal Dentist");
    }
}
