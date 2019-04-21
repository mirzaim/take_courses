package com.university;

import java.util.ArrayList;

/**
 * This class simulate university take course system
 */

public class University {
    private ArrayList<Department> departments;

    /**
     * Construct new university object with empty department
     */
    public University() {
        departments = new ArrayList<>();
    }

    /**
     * Return swallow copy of university's department.
     *
     * @return University's departments array
     */
    public Department[] getDepartments() {
        return departments.toArray(new Department[0]);
    }

    /**
     * Add a department to university.
     *
     * @param department department that add to university
     */
    public void addDepartment(Department department) {
        departments.add(department);
    }

    /**
     * Remove a department from university.
     *
     * @param department department that remove from university
     */
    public void removeDepartment(Department department) {
        departments.remove(department);
    }
}
