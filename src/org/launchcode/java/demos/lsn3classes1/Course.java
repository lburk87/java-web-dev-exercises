package org.launchcode.java.demos.lsn3classes1;
import java.util.ArrayList;

public class Course {

    public String name;
    protected ArrayList<String> students;
    private String location;

    private Course(String name, ArrayList students, String location) {
        this.name = name;
        this.students = students;
        this.location = location;
    }

}