package com.university;

import java.util.ArrayList;

public class University {
    private ArrayList<Department> departments;

    public University() {
        departments = new ArrayList<>();
    }

    public Department[] getDepartments() {
        return departments.toArray(new Department[0]);
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }
}
