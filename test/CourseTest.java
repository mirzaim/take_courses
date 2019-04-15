package test;

import com.university.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CourseTest {
    static Course course;
    static Department ceDepartment;
    static Professor professor;

    @BeforeAll
    public static void createCourse() {
        professor = new Professor(ceDepartment, "Samiei");
        ceDepartment = new Department("Computer and IT Eng");
        course = new Course("1", "AP", ceDepartment, professor, 5);
    }

    @Test
    public void testCourseGetId() {
        assertEquals("1", course.getID());
    }

    @Test
    public void testCourseGetDepartment() {
        assertEquals(ceDepartment, course.getDepartment());
    }

    @Test
    public void testCourseGetName() {
        assertEquals("AP", course.getName());
    }

    @Test
    public void testCourseGetProfessor() {
        assertEquals(professor, course.getProfessor());
    }

    @Test
    public void testCourseEnrollStudent() {
        Department mathDepartment = new Department("Math");

        Student student1 = new Student("Morteza", "1", "Software Eng", ceDepartment);
        Student student2 = new Student("Mahdi", "2", "Mathematics", mathDepartment);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);

        course.enrollStudent(student1);
        course.enrollStudent(student2);
        course.enrollStudent(null);
        assertArrayEquals(students.toArray(new Student[0]), course.getStudents());
    }
}
