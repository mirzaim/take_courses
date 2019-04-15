package com.university;

import java.util.LinkedList;

public class Course {
    private String id;
    private String name;
    private Department department;
    private Professor professor;
    private int credit;
    private LinkedList<Student> students;


    public Course(String id, String name, Department department, Professor professor, int credit) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.professor = professor;
        this.credit = credit;

        students = new LinkedList<>();
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public Professor getProfessor() {
        return professor;
    }

    public int getCredit() {
        return credit;
    }

    public void enrollStudent(Student student) {
        try {
            if (student.getDepartment().equals(department))
                students.add(student);
        } catch (Exception e) {
        }
    }

    public Student[] getStudents() {
        return students.toArray(new Student[0]);
    }

}
