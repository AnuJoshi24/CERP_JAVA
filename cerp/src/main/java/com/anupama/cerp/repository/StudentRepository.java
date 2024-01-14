package com.anupama.cerp.repository;

import com.anupama.cerp.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student , Long> {
    Student findByEmailAndPassword(String email , String password);
}
