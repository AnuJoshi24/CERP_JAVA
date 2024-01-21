package com.anupama.cerp.projection;

import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
public class ScheduleProjection implements Serializable {

    private long scheduleId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String location;
    private String subjectName;

    public ScheduleProjection() {
        super();
    }

    public ScheduleProjection(long scheduleId, LocalDateTime startTime, LocalDateTime endTime, String location, String subjectName) {
        this.scheduleId = scheduleId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.subjectName = subjectName;
    }

    public void setScheduleId(long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "scheduleId=" + scheduleId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", location='" + location + '\'' +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
