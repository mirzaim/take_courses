package test;

import com.university.Department;
import com.university.University;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class UniversityTest {
    private static Department ce;
    private static Department cs;
    private static University university;

    @BeforeAll
    public static void initializeUniversity() {
        ce = new Department("Computer and IT Eng");
        cs = new Department("CS");
    }

    @BeforeEach
    public void creteUniversity() {
        university = new University();
    }

    @Test
    public void testAddDepartment() {
        ArrayList<Department> departments = new ArrayList<>();
        departments.add(ce);
        departments.add(cs);

        university.addDepartment(ce);
        university.addDepartment(cs);

        assertEquals(departments.toArray(new Department[0]), university.getDepartments());
    }

    @Test
    public void testRemoveDepartment() {
        university.addDepartment(ce);
        university.addDepartment(cs);

        assertEquals(2, university.getDepartments().length);

        university.removeDepartment(cs);

        assertEquals(1, university.getDepartments().length);
    }

    @Test
    public void testGetDepartment() {
        ArrayList<Department> departments = new ArrayList<>();
        departments.add(ce);

        university.addDepartment(ce);

        assertEquals(departments.toArray(new Department[0]), university.getDepartments());
        assertNotNull(university.getDepartments());

    }
}
