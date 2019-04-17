package test;

import com.university.Course;
import com.university.Department;
import com.university.Professor;
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
        Professor professor = new Professor(department, "Dr.Kalbasi");
        course = new Course("1", "AP", department, professor, 3);
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
        assertNotNull(student.getID());
        assertEquals("1234", student.getID());
    }

    @Test
    public void testStudentGetDepartment() {
        assertNotNull(student.getDepartment());
        assertEquals(department, student.getDepartment());
    }

    @Test
    public void testStudentGetMajor() {
        assertNotNull(student.getMajor());
        assertEquals("Software Eng", student.getMajor());
    }

    @Test
    public void testStudentAddCourse() {
        student.addCourse(null);
        assertEquals(0, student.getCourses().length);
        student.addCourse(course);
        assertEquals(1, student.getCourses().length);
    }

}
