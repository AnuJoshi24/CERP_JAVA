package com.anupama.cerp.service;

import com.anupama.cerp.Dto.AttendanceRequestDto;
import com.anupama.cerp.custom_exceptions.EntityNotFoundException;
import com.anupama.cerp.entities.Attendance;
import com.anupama.cerp.entities.Student;
import com.anupama.cerp.entities.Subject;
import com.anupama.cerp.projection.AttendanceList;
import com.anupama.cerp.projection.AttendanceRecord;
import com.anupama.cerp.repository.AttendanceRepository;
import com.anupama.cerp.repository.StudentRepository;
import com.anupama.cerp.repository.SubjectRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AttendanceServiceImpl implements AttendanceService{

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;
    @Override
    public List<AttendanceRecord> showAttendanceByStudent(Long studentId) {
        return attendanceRepository.findAttendanceByStudent(studentId);
    }

    @Override
    public Attendance addAttendance(AttendanceRequestDto attendanceRequestDto, String subjectName) {
        // get student id , get subject name , find attendance by student and subject , if its null set values
        Student student = studentRepository.findById(attendanceRequestDto.getStudentId())
                .orElseThrow(()-> new EntityNotFoundException("Student not found with id: " + attendanceRequestDto.getStudentId()));
        Subject subject = subjectRepository.findBySubjectName(subjectName);
        Attendance att = attendanceRepository.findAttendanceByStudentAndSubject(student,subject);
        Attendance attendance = new Attendance();
        if(att == null){
            attendance.setStudent(student);
            attendance.setSubject(subject);
            attendance.setAttendance(attendanceRequestDto.getAttendance());
           return attendanceRepository.save(attendance);
        }else{
            return null;
        }
    }

    @Cacheable(cacheNames = "attendance" , key = "#subjectName")
    @Override
    public List<AttendanceList> showAttendance(String subjectName) {
        System.out.println("Calling attendance db : ");
        return attendanceRepository.findAllBySubjectNameAndSortedById(subjectName);
    }

    @Override
    public void updateAttendance(int attendance, String subjectName, Long studentId) {
        Student student = studentRepository.findById(studentId).get();
        Subject subject = subjectRepository.findBySubjectName(subjectName);
        Attendance at = attendanceRepository.findAttendanceByStudentAndSubject(student, subject);
        at.setAttendance(attendance);

    }
}
