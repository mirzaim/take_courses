package test;

import com.university.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class CourseTest {
    static Course course;
    static Department ceDepartment;
    static Professor professor;
    static Department mathDepartment;

    @BeforeAll
    public static void createCourse() {
        professor = new Professor(ceDepartment, "Samiei");
        ceDepartment = new Department("Computer and IT Eng");
        course = new Course("1", "AP", ceDepartment, professor, 3);
        mathDepartment = new Department("Math");
    }

    @Test
    public void testCourseGetId() {
        assertNotNull(course.getID());
        assertEquals("1", course.getID());
    }

    @Test
    public void testCourseGetDepartment() {
        assertNotNull(course.getDepartment());
        assertEquals(ceDepartment, course.getDepartment());
    }

    @Test
    public void testCourseGetName() {
        assertNotNull(course.getName());
        assertEquals("AP", course.getName());
    }

    @Test
    public void testCourseGetProfessor() {
        assertNotNull(course.getProfessor());
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
