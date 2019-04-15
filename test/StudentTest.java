package test;

import com.university.Department;
import com.university.Student;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class StudentTest {
    static Student student;
    static Department department;

    @BeforeAll
    public static void createStudent(){
        department = new Department("Computer and IT Eng");
        student = new Student("Alireza", "1234", "Software Eng", department);
    }

    @Test
    public void testStudentGetName(){
        assertEquals("Alireza", student.getName());
    }

    @Test
    public void testStudentGetCourses(){
        assertNotNull(student.getCourses());
        assertEquals(0, student.getCourses().length);
    }

}
