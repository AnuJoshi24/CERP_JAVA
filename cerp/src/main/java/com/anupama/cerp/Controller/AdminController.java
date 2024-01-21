package com.anupama.cerp.Controller;


import com.anupama.cerp.Dto.AdminDto;
import com.anupama.cerp.JWTSecurity.JWTHelper;
import com.anupama.cerp.entities.Admin;
import com.anupama.cerp.entities.Subject;
import com.anupama.cerp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admins")
@CrossOrigin(origins = "http://localhost:3000/") // to connect or talk to frontend
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private JWTHelper jwtHelper;

    //http://localhost:8080/admins/courses
    @PostMapping("/signin")
    public ResponseEntity<?> login(@RequestBody AdminDto adminDto) {
        Admin admin = adminService.authenticateAdmin(adminDto.getEmail(), adminDto.getPassword());
        if (admin != null) {
            String token = jwtHelper.generateToken(admin.getEmail(), Map.of("id", admin.getId()));
            return ResponseEntity.ok(Map.of("token", token, "id", admin.getId()));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username and password");
        }

    }


    @GetMapping("/courses")
    public ResponseEntity<?> getCourseList() throws InterruptedException {
        System.out.println("Calling course external db:");
        return ResponseEntity.ok(adminService.getCourseList());
    }


    @GetMapping("/courses/{courseName}")
    public ResponseEntity<?> getSubjectList(@PathVariable String courseName) {
        List<Subject> subjects = adminService.getSubjectList(courseName);
        if (subjects != null) {
            return ResponseEntity.ok(subjects);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Invalid course name");
        }

    }

}
