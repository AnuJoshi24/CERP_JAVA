package com.anupama.cerp.projection;

import com.anupama.cerp.entities.Student;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class AttendanceList implements Serializable {
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

    public void setStudent(Student student) {
        this.student = student;
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
