package test;

import com.university.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class DepartmentTest {
    private static Course apCourse;
    private static Course mCourse;
    private static Department mathDepartment;
    private static Department ceDepartment;
    private static Professor kalbasi;
    private static Professor khosravi;
    private static Student student1;
    private static Student student2;
    private static Student student3;

    @BeforeAll
    public static void CreateDepartment() {
        ceDepartment = new Department("Computer and IT Eng");
        mathDepartment = new Department("Math");

        kalbasi = new Professor(ceDepartment, "Dr.Kalbasi");
        khosravi = new Professor(mathDepartment, "Dr.Khosravi");
        apCourse = new Course("1", "AP", ceDepartment, kalbasi, 3);
        mCourse = new Course("2", "math", mathDepartment, khosravi, 3);


        student1 = new Student("Morteza", "1", "Software Eng", ceDepartment);
        student2 = new Student("Mahdi", "2", "Mathematics", mathDepartment);
        student3 = new Student("Gholi", "3", "Software Eng", ceDepartment);
    }

    @BeforeEach
    public void resetDepartment() {
        ceDepartment = new Department("Computer and IT Eng");
        mathDepartment = new Department("Math");
    }

    @Test
    public void testDepartmentAddStudent() {
        ceDepartment.addStudent(student1);
        assertEquals(1, ceDepartment.getStudents().length);
        ceDepartment.addStudent(student2);
        assertEquals(1, ceDepartment.getStudents().length);
    }

    @Test
    public void testDepartmentGetStudent() {
        ceDepartment.addStudent(student1);
        ceDepartment.addStudent(student2);
        ceDepartment.addStudent(student3);

        LinkedList<Student> students = new LinkedList<>();
        students.add(student1);
        students.add(student3);

        assertNotNull(ceDepartment.getStudents());
        assertArrayEquals(students.toArray(new Student[0]), ceDepartment.getStudents());
    }

    @Test
    public void testDepartmentRemoveStudent() {
        ceDepartment.addStudent(student1);

        Student student = new Student("Morteza", "1", "Software Eng", ceDepartment);

        ceDepartment.removeStudent(student2);
        assertEquals(1, ceDepartment.getStudents().length);
        ceDepartment.removeStudent(student3);
        assertEquals(1, ceDepartment.getStudents().length);
        ceDepartment.removeStudent(student);
        assertEquals(0, ceDepartment.getStudents().length);
    }

    @Test
    public void testDepartmentGetName() {
        assertEquals("Computer and IT Eng", ceDepartment.getName());
    }

    @Test
    public void testDepartmentAddCourse() {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(apCourse);

        ceDepartment.addCourse(apCourse);
        ceDepartment.addCourse(mCourse);

        assertArrayEquals(courses.toArray(new Course[0]), ceDepartment.getCourses());
    }

    @Test
    public void testDepartmentGetCourses() {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(apCourse);

        ceDepartment.addCourse(apCourse);
        ceDepartment.addCourse(mCourse);

        assertArrayEquals(courses.toArray(new Course[0]), ceDepartment.getCourses());
        assertNotNull(ceDepartment.getCourses());
    }

    @Test
    public void testDepartmentRemoveCourse() {
        ceDepartment.addCourse(apCourse);
        Course narm = new Course("23", "NarmAfzar",
                ceDepartment, new Professor(ceDepartment, "Ali"), 3);

        ceDepartment.removeCourse(mCourse);
        assertEquals(1, ceDepartment.getCourses().length);
        ceDepartment.removeCourse(narm);
        assertEquals(1, ceDepartment.getCourses().length);
        ceDepartment.removeCourse(apCourse);
        assertEquals(0, ceDepartment.getCourses().length);
    }

    @Test
    public void testDepartmentAddProfessor() {
        ArrayList<Professor> professors = new ArrayList<>();
        professors.add(kalbasi);

        ceDepartment.addProfessor(kalbasi);
        ceDepartment.addProfessor(khosravi);

        assertArrayEquals(professors.toArray(new Professor[0]), ceDepartment.getProfessors());
    }

    @Test
    public void testDepartmentGetProfessors() {
        ArrayList<Professor> professors = new ArrayList<>();
        professors.add(kalbasi);

        ceDepartment.addProfessor(kalbasi);
        ceDepartment.addProfessor(khosravi);

        assertArrayEquals(professors.toArray(new Professor[0]), ceDepartment.getProfessors());
        assertNotNull(ceDepartment.getProfessors());
    }

    @Test
    public void testDepartmentRemoveProfessors() {
        ceDepartment.addProfessor(kalbasi);
        ceDepartment.removeProfessor(kalbasi);
        assertEquals(0, ceDepartment.getProfessors().length);
    }

}
