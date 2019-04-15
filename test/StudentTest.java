package test;

import com.university.Course;
import com.university.Department;
import com.university.Student;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class StudentTest {
    static Student student;
    static Department department;
    static Course course;

    @BeforeAll
    public static void createStudent() {
        department = new Department("Computer and IT Eng");
        student = new Student("Alireza", "1234", "Software Eng", department);
    }

    @Test
    public void testStudentGetName() {
        assertEquals("Alireza", student.getName());
    }

    @Test
    public void testStudentGetCourses() {
        assertNotNull(student.getCourses());
        assertEquals(0, student.getCourses().length);
    }

    @Test
    public void testStudentGetID() {
        assertEquals("1234", student.getID());
    }

    @Test
    public void testStudentGetDepartment() {
        assertEquals(department, student.getDepartment());
    }

    @Test
    public void testStudentGetMajor() {
        assertEquals("Software Eng", student.getMajor());
    }

    @Test
    public void testStudentAddCourse() {
        student.addCourse(null);
        assertEquals(0, student.getCourses().length);
    }

}
