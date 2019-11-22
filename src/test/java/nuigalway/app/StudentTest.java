package nuigalway.app;

import org.joda.time.DateTime;
import org.junit.*;
import org.joda.*;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;

public class StudentTest {

    @Test
    public void getUsername_nameIsSetAgeIsCorrect_returnsUsername() {
        DateTime studentDOB = new DateTime(1997, 05, 26, 0, 0);
        Student testStudent = new Student("Jack", "Sheehan", "16325771", studentDOB);

        assertEquals("JackSheehan22", testStudent.getUsername());
    }

    @Test
    public void setName_setNameToNameSpecified_nameChanges() {
        DateTime studentDOB = new DateTime(1997, 05, 26, 0, 0);
        Student testStudent = new Student("Karter", "Bradley", "16325771", studentDOB);

        testStudent.setFirstName("Jack");
        testStudent.setLastName("Sheehan");

        assertEquals("Jack Sheehan", testStudent.getFirstName() + " " + testStudent.getLastName());
    }
}
