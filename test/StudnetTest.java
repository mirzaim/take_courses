package test;

import com.university.Department;
import com.university.Student;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class StudnetTest {
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
    public void testStudenGetCourses(){
        assertNotNull(student.getCourses());
        assertEquals(0, student.getCourses().length);
    }

}
