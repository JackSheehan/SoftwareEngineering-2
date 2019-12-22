package nuigalway.app;

import java.util.ArrayList;
import java.util.List;

public class Course {

    String courseName;
    List<Module> moduleList;

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
}
