package com.anupama.cerp.repository;

import com.anupama.cerp.entities.Course;
import com.anupama.cerp.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
    // find by subject name
    Subject findBySubjectName(String name);

    // find by course
    List<Subject> findAllByCourse(Course course);
}
