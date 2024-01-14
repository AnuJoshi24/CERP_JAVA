package com.anupama.cerp.service;

import com.anupama.cerp.Dto.ScheduleDto;
import com.anupama.cerp.entities.Schedule;


import java.util.List;

public interface ScheduleService {

    Schedule addSchedule(ScheduleDto scheduleDto , String courseName);
    List<com.anupama.cerp.projection.ScheduleProjection> getSchedule(String courseName);
    void editSchedule(ScheduleDto scheduleDto , String courseName);
    String deleteSchedule(Long id);
}
