package com.university;

import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private String major;
    private Department department;
    private ArrayList<Course> courses;

    public Student(String name, String id, String major, Department department) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.department = department;
        courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return null;
    }

    public String getMajor() {
        return null;
    }

    public Department getDepartment() {
        return null;
    }

    public Course[] getCourses() {
        return courses.toArray(new Course[0]);
    }

    public void addCourse(Course course) {

    }
}
