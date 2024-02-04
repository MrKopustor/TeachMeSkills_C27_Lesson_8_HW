package com.teachmeskills.lesson8.staff;

public abstract class HospitalStaff {
    public int treatmentPlanCode;

    public HospitalStaff(int treatmentPlanCode) {
        this.treatmentPlanCode = treatmentPlanCode;
    }

    public abstract void treat();

}