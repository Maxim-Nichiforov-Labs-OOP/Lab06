package com.company;

import com.company.Hospital.Staff.OperationsStaff;
import com.company.Utils.History;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends Person {
    public String id;
    public Date accepted;
    public History sickness;

    public ArrayList<String> prescriptions = new ArrayList<String>();
    public ArrayList<String> allergies = new ArrayList<String>();
    public ArrayList<String> specialReqs = new ArrayList<String>();

    public Integer age;

    public ArrayList<OperationsStaff> operationsStaff;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
