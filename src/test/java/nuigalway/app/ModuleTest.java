package nuigalway.app;

import org.joda.time.DateTime;
import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class ModuleTest {

    @Test
    public void getStudentList_moduleHasTwoStudentsEnrolled_returnsListOfStudentsWithSize2() {
        Module testModule = new Module("CT417", "Software Engineering");

        DateTime studentDOB = new DateTime(1997, 05, 26, 0, 0);
        Student testStudent1 = new Student("Jack", "Sheehan", "16325771", studentDOB);
        Student testStudent2 = new Student("John", "Korshaw", "16328771", studentDOB);

        testModule.addStudent(testStudent1);
        testModule.addStudent(testStudent2);

        assertEquals(testModule.getStudentList().size(), 2);
    }
}
