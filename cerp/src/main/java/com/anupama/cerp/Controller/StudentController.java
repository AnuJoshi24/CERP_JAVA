package com.anupama.cerp.Controller;

import com.anupama.cerp.Dto.StudentDto;
import com.anupama.cerp.Dto.StudentLoginDetails;
import com.anupama.cerp.JWTSecurity.JWTHelper;
import com.anupama.cerp.entities.Student;
import com.anupama.cerp.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:3000/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private JWTHelper jwtHelper;

    @PostMapping("/signup")
    public ResponseEntity<?> studentRegistration(@Valid @RequestBody StudentDto studentDto){
        Student st = studentService.addStudent(studentDto , studentDto.getCourseId());
        if(st!=null){
            return ResponseEntity.status(HttpStatus.CREATED).body(st);
        }else{
            return ResponseEntity.status(HttpStatus.ALREADY_REPORTED).body("Student  already signed up");

        }
    }

    // get student details
    @GetMapping("/{studentId}")
    public ResponseEntity<?> getStudentDetails(@PathVariable Long studentId){
        return ResponseEntity.ok(studentService.getStudentDetails(studentId));

    }

    //signin
    @PostMapping("/signin")
    public ResponseEntity<?> login(@RequestBody StudentLoginDetails details){
        Student student = studentService.authenticateStudent(details.getEmail(),details.getPassword());
        if(student!=null){
            String token = jwtHelper.generateToken(student.getEmail(), Map.of("id", student.getId()));
            return ResponseEntity.ok(Map.of("token",token,"id",student.getId()));
        }else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username and password");
        }

    }
}
