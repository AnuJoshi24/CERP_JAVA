package com.anupama.cerp.service;

import com.anupama.cerp.entities.Admin;
import com.anupama.cerp.entities.Course;
import com.anupama.cerp.entities.Subject;

import java.util.List;

public interface AdminService {
    Admin authenticateAdmin(String email , String password);
    List<Course> getCourseList() throws InterruptedException;
    List<Subject> getSubjectList(String courseName);
}
