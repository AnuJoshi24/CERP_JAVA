package com.anupama.cerp.Controller;


import com.anupama.cerp.Dto.AttendanceRequestDto;
import com.anupama.cerp.Dto.UpdateAttendanceDto;
import com.anupama.cerp.entities.Attendance;
import com.anupama.cerp.projection.AttendanceList;
import com.anupama.cerp.service.AttendanceService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendance")
@CrossOrigin(origins = "http://localhost:3000/")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;


    @GetMapping("/{studentId}")
    public ResponseEntity<?> showAttendance(@PathVariable Long studentId){
        return ResponseEntity.ok(attendanceService.showAttendanceByStudent(studentId));

    }

    @PostMapping("/{subjectName}")
    public ResponseEntity<?> addAttendance(@Valid @RequestBody AttendanceRequestDto attendanceRequestDto, @PathVariable String subjectName){
     Attendance attendance = attendanceService.addAttendance(attendanceRequestDto,subjectName);
     if(attendance!=null){
         return ResponseEntity.status(HttpStatus.CREATED).body(attendance);
     }else{
         return ResponseEntity.status(500).body("Attendance is already present");
     }
    }


    @GetMapping("/admins/{subjectName}")
    public ResponseEntity<?> showAttendance(@PathVariable String subjectName){
        List<AttendanceList> list = attendanceService.showAttendance(subjectName);
        if(list!=null){
           return ResponseEntity.ok(list);
        }else{
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Invalid subject name");
        }

    }



    @PatchMapping("/{subjectName}/{studentId}")
    public ResponseEntity<?> updateAttendance(@RequestBody UpdateAttendanceDto updateAttendanceDto , @PathVariable String subjectName , @PathVariable Long studentId){
       attendanceService.updateAttendance(updateAttendanceDto.getAttendance(),subjectName,studentId);
       return ResponseEntity.ok("updated successfully");
    }


}
