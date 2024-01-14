package com.anupama.cerp.repository;

import com.anupama.cerp.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course , Long> {
    Course findByCourseName(String courseName);
}
