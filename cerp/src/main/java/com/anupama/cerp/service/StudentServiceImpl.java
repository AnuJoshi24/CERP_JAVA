package com.anupama.cerp.service;

import com.anupama.cerp.Dto.StudentDto;
import com.anupama.cerp.custom_exceptions.EntityNotFoundException;
import com.anupama.cerp.entities.Course;
import com.anupama.cerp.entities.Student;
import com.anupama.cerp.repository.CourseRepository;
import com.anupama.cerp.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(StudentDto studentDto, Long courseId) {
        Course course = courseRepository.findById(courseId)
                .orElseThrow(()-> new EntityNotFoundException("Course not found with id :" + courseId));
        Student st = studentRepository.findByEmailAndPassword(studentDto.getEmail(),studentDto.getPassword());
        if(st==null){
            Student student = new Student();
            student.setFirstName(studentDto.getFirstName());
            student.setLastName(studentDto.getLastName());
            student.setEmail(studentDto.getEmail());
            student.setPassword(studentDto.getPassword());
            student.setGender(studentDto.getGender());
            student.setAddress(studentDto.getAddress());
            student.setCourse(course);
            return studentRepository.save(student);

        }else{
            return null;
        }
    }

    @Override
    public Student getStudentDetails(Long studentId) {
        System.out.println("Calling external student db");
        return studentRepository.findById(studentId)
                .orElseThrow(()-> new EntityNotFoundException("Student not found with id:"+studentId));
    }

    @Override
    public Student authenticateStudent(String email, String password) {
        return studentRepository.findByEmailAndPassword(email,password);
    }
}
