package com.curdmvc.curdmvc;

import java.util.UUID;

public class Staff {

    private String staffName;
    private String staffTitle;
    private double staffSalary;
    private String id;

    public Staff(String staffName, String staffTitle, double staffSalary) {
        this.staffName = staffName;
        this.staffTitle = staffTitle;
        this.staffSalary = staffSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Staff() {
        this.id = UUID.randomUUID().toString();
    }

    public String getStaffName() {
        return this.staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffTitle() {
        return this.staffTitle;
    }

    public void setStaffTitle(String staffTitle) {
        this.staffTitle = staffTitle;
    }

    public double getStaffSalary() {
        return this.staffSalary;
    }

    public void setStaffSalary(double staffSalary) {
        this.staffSalary = staffSalary;
    }

}
