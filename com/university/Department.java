package com.university;

public class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {

    }

    public Student[] getStudents() {
        return null;
    }

    public void removeStudent(Student student) {

    }

    public void addCourse(Course course) {

    }

    public Course[] getCourses() {
        return null;
    }

    public void removeCourse(Course course) {

    }

    public void addProfessor(Professor student) {

    }

    public Professor[] getProfessors() {
        return null;
    }

    public void removeProfessor(Professor professor) {

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Department department = (Department) obj;
        return department.getName().equals(this.getName());
    }
}
