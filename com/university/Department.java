package com.university;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private ArrayList<Professor> professors;

    public Department(String name) {
        this.name = name;
        students = new ArrayList<>();
        courses = new ArrayList<>();
        professors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        if (student.getDepartment().equals(this))
            students.add(student);
    }

    public Student[] getStudents() {
        return students.toArray(new Student[0]);
    }

    public void removeStudent(Student student) {
        if (student.getDepartment().equals(this))
            students.remove(student);
        ;
    }

    public void addCourse(Course course) {
        if (course.getDepartment().equals(this))
            courses.add(course);
    }

    public Course[] getCourses() {
        return courses.toArray(new Course[0]);
    }

    public void removeCourse(Course course) {
        if (course.getDepartment().equals(this))
            courses.remove(course);
    }

    public void addProfessor(Professor professor) {
        if (professor.getDepartment().equals(this))
            professors.add(professor);
    }

    public Professor[] getProfessors() {
        return professors.toArray(new Professor[0]);
    }

    public void removeProfessor(Professor professor) {
        if (professor.getDepartment().equals(this))
            professors.remove(professor);
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
