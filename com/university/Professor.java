package com.university;

public class Professor {
    private Department department;
    private String name;

    public Professor(Department department, String name) {
        this.department = department;
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public Course[] getCourses() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Professor professor = (Professor) obj;
        return professor.getName().equals(this.getName()) &&
                professor.getDepartment().equals(this.getDepartment());
    }
}
