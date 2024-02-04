package com.teachmeskills.lesson8.staff.ext;

import com.teachmeskills.lesson8.staff.HospitalStaff;


public class Surgeon extends HospitalStaff {

    public Surgeon(int treatmentPlanCode) {
        super(treatmentPlanCode);
    }

    @Override
    public void treat() {
        System.out.println("Heal Surgeon");
    }
}
