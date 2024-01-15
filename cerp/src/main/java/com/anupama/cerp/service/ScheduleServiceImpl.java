package com.anupama.cerp.service;

import com.anupama.cerp.Dto.ScheduleDto;
import com.anupama.cerp.entities.Course;
import com.anupama.cerp.entities.Schedule;
import com.anupama.cerp.entities.Subject;
import com.anupama.cerp.repository.CourseRepository;
import com.anupama.cerp.repository.ScheduleRepository;
import com.anupama.cerp.repository.SubjectRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService{
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private ScheduleRepository scheduleRepository;
    @Override
    public Schedule addSchedule(ScheduleDto scheduleDto, String courseName) {
        Course course = courseRepository.findByCourseName(courseName);
        Subject subject = subjectRepository.findBySubjectName(scheduleDto.getSubjectName());
        Schedule schedule = new Schedule();
        schedule.setStartTime(scheduleDto.getStartTime());
        schedule.setEndTime(scheduleDto.getEndTime());
        schedule.setLocation(scheduleDto.getLocation());
        schedule.setCourse(course);
        schedule.setSubject(subject);
        return scheduleRepository.save(schedule);
    }

    @Override
    public List<com.anupama.cerp.projection.ScheduleProjection> getSchedule(String courseName) {
        return scheduleRepository.findFullScheduleByCourse(courseName);
    }

    @Override
    public void editSchedule(ScheduleDto scheduleDto, String courseName) {
     Subject subject = subjectRepository.findBySubjectName(scheduleDto.getSubjectName());
     Course course = courseRepository.findByCourseName(courseName);
     Schedule editedSchedule = scheduleRepository.findById(scheduleDto.getId()).get();
     if(scheduleDto.getStartTime()!=null){
         editedSchedule.setStartTime(scheduleDto.getStartTime());
     }
     if (scheduleDto.getEndTime()!=null){
         editedSchedule.setEndTime(scheduleDto.getEndTime());
     }
     if(scheduleDto.getLocation()!=null){
         editedSchedule.setLocation(scheduleDto.getLocation());
     }

     if(subject!=null){
         editedSchedule.setSubject(subject);
     }

     editedSchedule.setCourse(course);
    }

    @Override
    public String deleteSchedule(Long id) {
        if(scheduleRepository.existsById(id)){
            scheduleRepository.deleteById(id);
            return "Schedule deleted successfully";
        }
        return "Deletion failed due to invalid schedule id";
    }
}
