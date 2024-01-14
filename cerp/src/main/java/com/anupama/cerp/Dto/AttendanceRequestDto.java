package com.anupama.cerp.Dto;

public class AttendanceRequestDto {

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

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public int getAttendance() {
        return attendance;
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
