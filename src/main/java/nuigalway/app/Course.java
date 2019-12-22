package nuigalway.app;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseName;
    private List<Module> moduleList;
    private List<Student> courseStudentList = new ArrayList<>();
    private DateTime academicStartDate;
    private DateTime academicEndDate;

    public Course() {

    }

    public Course(String courseName, List<Module> moduleList) {
        this.courseName = courseName;
        this.moduleList = moduleList;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Module> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<Module> moduleList) {
        this.moduleList = moduleList;
    }

    public void setAcademicStartDate(DateTime academicStartDate) {
        this.academicStartDate = academicStartDate;
    }

    public DateTime getAcademicStartDate() {
        return academicStartDate;
    }

    public void setAcademicEndDate(DateTime academicEndDate) {
        this.academicEndDate = academicEndDate;
    }

    public DateTime getAcademicEndDate() {
        return academicEndDate;
    }

    public List<Student> getStudentList() {
        for(Module module : getModuleList()) {
            for(Student student : module.getStudentList()) {
                courseStudentList.add(student);
            }
        }
        return courseStudentList;
    }
}
