package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        double qualityScore = (this.numberOfCredits * this.gpa) + (courseCredits * grade);
        this.numberOfCredits = this.numberOfCredits + courseCredits;
        this.gpa = qualityScore/this.numberOfCredits;
    }

    public String getGradeLevel() {
        String gradeLevel = "";
        if (this.numberOfCredits < 30) {
            gradeLevel = "Freshman";
        } else if (this.numberOfCredits < 60) {
            gradeLevel = "Sophomore";
        } else if (this.numberOfCredits < 90) {
            gradeLevel = "Junior";
        } else if (this.numberOfCredits > 90) {
            gradeLevel = "Senior";
        }
        return gradeLevel;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    protected double getGpa() {
        return gpa;
    }

    public void setName(String aName) {
        name = aName;
    }

    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    protected void setGpa(double aGpa) {
        gpa = aGpa;
    }

    @Override
    public String toString() {
        return "Student: " + name  +
                ", ID: " + studentId +
                ", Credits: " + numberOfCredits +
                ", GPA: " + gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStudentId() == student.getStudentId() &&
                getNumberOfCredits() == student.getNumberOfCredits() &&
                Double.compare(student.getGpa(), getGpa()) == 0 &&
                getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStudentId(), getNumberOfCredits(), getGpa());
    }
}