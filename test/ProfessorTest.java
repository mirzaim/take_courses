package test;

import com.university.Department;
import com.university.Professor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfessorTest {
    private static Professor professor;
    private static Department department;

    @BeforeAll
    public static void createProfessor() {
        department = new Department("Computer and IT Eng");
        professor = new Professor(department, "Ali");
    }

    @Test
    public void testGetDepartment() {
        assertEquals(department, professor.getDepartment());
    }

    @Test
    public void testGetName() {
        assertEquals("Ali", professor.getName());
    }
}
