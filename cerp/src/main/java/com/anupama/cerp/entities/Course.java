package com.anupama.cerp.entities;

import jakarta.persistence.Entity;

@Entity
public class Course extends BaseEntity{

    private String courseName;

    public Course() {
        super();
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}
