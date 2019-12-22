package nuigalway.app;

import org.joda.time.DateTime;
import org.joda.time.Years;

import java.util.ArrayList;

public class Student {
    private DateTime dob;
    private String firstName;
    private String lastName;
    private String id;
    private int age;
    private String username;

    public Student(String firstName, String lastName, String id, DateTime dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.dob = dob;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = getUsername();
    }

    public int getAge() {
        DateTime today = new DateTime();
        Years yearsBetween = Years.yearsBetween(getDob(), today);
        age = yearsBetween.getYears();

        return age;
    }

    public String getUsername() {
        return firstName + lastName + getAge();
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public DateTime getDob() {
        return dob;
    }
}
