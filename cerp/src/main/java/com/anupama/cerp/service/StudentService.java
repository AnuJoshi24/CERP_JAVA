package com.anupama.cerp.service;

import com.anupama.cerp.Dto.StudentDto;
import com.anupama.cerp.entities.Student;

public interface StudentService {

    Student addStudent(StudentDto studentDto , Long courseId);
    Student getStudentDetails(Long studentId);
    Student authenticateStudent(String email , String password);

}
