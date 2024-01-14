package com.anupama.cerp.projection;

import com.anupama.cerp.entities.Course;

public class AttendanceRecord {

    private int attendance;
    private String subjectName;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String address;
    private Course course;

    public AttendanceRecord() {
        super();
    }

    public AttendanceRecord(int attendance, String subjectName, String firstName, String lastName, String email, String gender, String address, Course course) {
        this.attendance = attendance;
        this.subjectName = subjectName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.course = course;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "AttendanceRecord{" +
                "attendance=" + attendance +
                ", subjectName='" + subjectName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", course=" + course +
                '}';
    }
}
