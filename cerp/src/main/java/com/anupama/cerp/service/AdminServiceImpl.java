package com.anupama.cerp.service;

import com.anupama.cerp.entities.Admin;
import com.anupama.cerp.entities.Course;
import com.anupama.cerp.entities.Subject;
import com.anupama.cerp.repository.AdminRepository;
import com.anupama.cerp.repository.CourseRepository;
import com.anupama.cerp.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public Admin authenticateAdmin(String email, String password) {

        return adminRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public List<Course> getCourseList() {
        List<Course> courses = courseRepository.findAll();
        return courses;
    }

    @Override
    public List<Subject> getSubjectList(String courseName) {
        Course course = courseRepository.findByCourseName(courseName);
        List<Subject> subjects = subjectRepository.findAllByCourse(course);
        return subjects;
    }
}