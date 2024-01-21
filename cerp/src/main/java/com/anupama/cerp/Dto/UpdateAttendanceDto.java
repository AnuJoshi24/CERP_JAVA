package com.anupama.cerp.Dto;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class UpdateAttendanceDto implements Serializable {
    private int attendance;

    public UpdateAttendanceDto() {
        super();
    }

    public UpdateAttendanceDto(int attendance) {
        super();
        this.attendance = attendance;
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
