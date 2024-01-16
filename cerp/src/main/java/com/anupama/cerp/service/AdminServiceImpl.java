package com.anupama.cerp.service;

import com.anupama.cerp.entities.Admin;
import com.anupama.cerp.entities.Course;
import com.anupama.cerp.entities.Subject;
import com.anupama.cerp.repository.AdminRepository;
import com.anupama.cerp.repository.CourseRepository;
import com.anupama.cerp.repository.SubjectRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

import static java.lang.Thread.sleep;

@Service
@Transactional
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
    public List<Course> getCourseList() throws InterruptedException {
        sleep(2);
        System.out.println("Calling external db : ");
        List<Course> courses = courseRepository.findAll();
        return courses;
    }

    @Cacheable(cacheNames = "subjectlist" , key= "#courseName")
    @Override
    public List<Subject> getSubjectList(String courseName) {
        System.out.println("Getting subject list from db:");
        Course course = courseRepository.findByCourseName(courseName);
        List<Subject> subjects = subjectRepository.findAllByCourse(course);
        return subjects;
    }
}