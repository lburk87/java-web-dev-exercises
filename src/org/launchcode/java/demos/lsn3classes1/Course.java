package org.launchcode.java.demos.lsn3classes1;
import java.util.ArrayList;
import java.util.Objects;

public class Course {

    private String name;
    private double credits;
    private ArrayList<Student> roster;

    private Course(String name, double credits) {
        this.name = name;
        this.credits = credits;
        this.roster = new ArrayList<Student>(); //empty array list
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", credits=" + credits +
                ", roster=" + roster +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return Double.compare(course.credits, credits) == 0 &&
                Objects.equals(name, course.name) &&
                Objects.equals(roster, course.roster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, credits, roster);
    }
}