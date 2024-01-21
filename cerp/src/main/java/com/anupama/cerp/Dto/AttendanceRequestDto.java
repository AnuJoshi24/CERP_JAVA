package com.anupama.cerp.Dto;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class AttendanceRequestDto implements Serializable {

    private long studentId;
    private int attendance;

    public AttendanceRequestDto() {
        super();
    }

    public AttendanceRequestDto(long studentId, int attendance) {
        super();
        this.studentId = studentId;
        this.attendance = attendance;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "AttendanceRequestDto{" +
                "studentId=" + studentId +
                ", attendance=" + attendance +
                '}';
    }
}
