package com.anupama.cerp.projection;

import com.anupama.cerp.entities.Course;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class AttendanceRecord implements Serializable {

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

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
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
