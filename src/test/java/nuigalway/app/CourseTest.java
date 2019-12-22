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
        Student testStudent = new Student("Jack", "Sheehan", "16325771", studentDOB);

        Module module1 = new Module("CT417", "Software Engineering 3");
        Module module2 = new Module("CT421", "Artificial Intelligence");

        List<Module> moduleList = new ArrayList<>();

        moduleList.add(module1);
        moduleList.add(module2);

        course1.setCourseName("CS&IT");
        course1.setModuleList(moduleList);
    }

    @Test
    public void getCourseName_hasACourseNameSet_returnsCourseName() {
        assertEquals(course1.getCourseName(), "CS&IT");
    }
}
