package nuigalway.app;

import org.joda.time.DateTime;

import org.junit.*;
import static junit.framework.TestCase.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class CourseTest {

    Course course1 = new Course();

    @Before
    public void setUp() {
        DateTime studentDOB = new DateTime(1997, 05, 26, 0, 0);
        Student testStudent1 = new Student("Jack", "Sheehan", "16325771", studentDOB);
        Student testStudent2 = new Student("James", "Korshaw", "16325771", studentDOB);

        Module module1 = new Module("CT417", "Software Engineering 3");
        Module module2 = new Module("CT421", "Artificial Intelligence");

        module1.addStudent(testStudent1);
        module2.addStudent(testStudent2);

        List<Module> moduleList = new ArrayList<>();

        moduleList.add(module1);
        moduleList.add(module2);

        DateTime academicEndDate = new DateTime(2019, 05, 1, 0, 0);

        course1.setCourseName("CS&IT");
        course1.setModuleList(moduleList);
        course1.setAcademicEndDate(academicEndDate);
    }

    @Test
    public void getCourseName_hasACourseNameSet_returnsCourseName() {
        assertEquals(course1.getCourseName(), "CS&IT");
    }

    @Test
    public void getStudentList_hasModulesAssigned_returnsStudentsEnrolled() {
        assertEquals(course1.getStudentList().size(), 2);
    }

    @Test
    public void getAcademicStartDate_hasAcademicStartDate_returnsAcademicStartDate() {
        DateTime academicEndDate = new DateTime(2019, 05, 1, 0, 0);
        assertEquals(course1.getAcademicEndDate(), academicEndDate);
    }
}
