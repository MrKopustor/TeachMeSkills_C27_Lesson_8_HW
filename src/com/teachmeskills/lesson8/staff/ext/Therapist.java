package com.teachmeskills.lesson8.staff.ext;

import com.teachmeskills.lesson8.staff.HospitalStaff;


public class Therapist extends HospitalStaff {

    public Therapist(int treatmentPlanCode) {
        super(treatmentPlanCode);
    }

    @Override
    public void treat() {
//        if (super.treatmentPlanCode != 1 && super.treatmentPlanCode != 2) {
            System.out.println("Heal Therapist");
//        }
    }

    public void appointDoctor() {
    }
}
