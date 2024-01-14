package com.anupama.cerp.repository;

import com.anupama.cerp.projection.AttendanceList;
import com.anupama.cerp.projection.AttendanceRecord;
import com.anupama.cerp.entities.Attendance;
import com.anupama.cerp.entities.Student;
import com.anupama.cerp.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

 // pass student id and find attendance of that id as per each subject
   @Query("select new com.anupama.cerp.projection.AttendanceRecord(a.attendance as attendance , s.subjectName as subjectName , st.firstName as firstName , st.lastName as lastName , st.email as email , st.gender as gender , st.address as address , st.course as course) from Attendance a join a.subject s join a.student st where a.student.id =:studentId")
    List<AttendanceRecord> findAttendanceByStudent(@Param("studentId") Long studentId);

// pass subject name and get student with attendance sorted by student id

    @Query("select new com.anupama.cerp.projection.AttendanceList(a.student as student , a.attendance as attendance) from Attendance a join a.student s join a.subject sb where a.subject.subjectName=:subjectName order by s.id")
    List<AttendanceList> findAllBySubjectNameAndSortedById(@Param("subjectName") String subjectName);

    //get attendance by student and subject
    Attendance findAttendanceByStudentAndSubject(Student student , Subject subject);
}