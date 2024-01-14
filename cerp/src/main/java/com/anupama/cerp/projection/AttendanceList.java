package com.anupama.cerp.projection;

import com.anupama.cerp.entities.Student;

public class AttendanceList {
  private Student student;
  private int attendance;

    public AttendanceList() {
        super();
    }

    public AttendanceList(Student student, int attendance) {
        super();
        this.student = student;
        this.attendance = attendance;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "AttendanceList{" +
                "student=" + student +
                ", attendance=" + attendance +
                '}';
    }
}
