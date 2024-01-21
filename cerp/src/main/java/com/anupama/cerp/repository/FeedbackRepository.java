package com.anupama.cerp.repository;

import com.anupama.cerp.entities.Feedback;
import com.anupama.cerp.entities.Student;
import com.anupama.cerp.entities.Subject;
import com.anupama.cerp.projection.FeedbackList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    // find list of feedback by subject id
    List<Feedback> findBySubjectId(Long subjectId);

    // find feedback by student and subject
    Feedback findByStudentAndSubject(Student student, Subject subject);

    //find by subject name and sort by student id

    @Query("select new com.anupama.cerp.projection.FeedbackList(f.student.id as studentId , f.knowledge as knowledge , f.communication as communication , f.punctuality as punctuality , f.teaching as teaching , f.guidance as guidance , f.suggestion as suggestion) from Feedback f join f.subject sb join f.student st where sb.subjectName=:subjectName order by st.id")
    List<FeedbackList> findAllBySubjectNameAndSortedById(@Param("subjectName") String subjectName);

}
