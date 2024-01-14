package com.anupama.cerp.repository;

import com.anupama.cerp.entities.Schedule;
import com.anupama.cerp.projection.ScheduleProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    // find schedule  by course name

    @Query("select new com.anupama.cerp.projection.ScheduleProjection(sc.id as scheduleId , sc.startTime as startTime , sc.endTime as endTime , sc.location as location  , sb.subjectName as subjectName) from Schedule sc join sc.subject sb where sc.course.courseName=:courseName")
    List<ScheduleProjection> findFullScheduleByCourse(@Param("courseName") String courseName);
}
