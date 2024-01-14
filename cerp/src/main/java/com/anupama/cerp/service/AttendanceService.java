package com.anupama.cerp.service;

import com.anupama.cerp.Dto.AttendanceRequestDto;
import com.anupama.cerp.entities.Attendance;
import com.anupama.cerp.projection.AttendanceList;
import com.anupama.cerp.projection.AttendanceRecord;

import java.util.List;

public interface AttendanceService {
    List<AttendanceRecord> showAttendanceByStudent(Long studentId);
    Attendance addAttendance(AttendanceRequestDto attendanceRequestDto , String subjectName);

    List<AttendanceList> showAttendance(String subjectName);

    void updateAttendance(int attendance , String subjectName , Long studentId);
}
