package com.anupama.cerp.Dto;

public class UpdateAttendanceDto {
    private int attendance;

    public UpdateAttendanceDto() {
        super();
    }

    public UpdateAttendanceDto(int attendance) {
        super();
        this.attendance = attendance;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "UpdateAttendanceDto{" +
                "attendance=" + attendance +
                '}';
    }
}
