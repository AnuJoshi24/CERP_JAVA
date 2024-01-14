package com.anupama.cerp.projection;

import java.time.LocalDateTime;

public class ScheduleProjection {

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

    public long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubjectName() {
        return subjectName;
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
