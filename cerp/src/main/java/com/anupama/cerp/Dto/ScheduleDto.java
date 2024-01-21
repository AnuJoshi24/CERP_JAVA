package com.anupama.cerp.Dto;

import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
public class ScheduleDto implements Serializable {
    private Long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String location;
    private String subjectName;

    public ScheduleDto() {
        super();
    }

    public ScheduleDto(Long id, LocalDateTime startTime, LocalDateTime endTime, String location, String subjectName) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.subjectName = subjectName;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "ScheduleDto{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", location='" + location + '\'' +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
