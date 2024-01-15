package com.anupama.cerp.Controller;


import com.anupama.cerp.Dto.ApiResponse;
import com.anupama.cerp.Dto.ScheduleDto;
import com.anupama.cerp.entities.Schedule;
import com.anupama.cerp.service.ScheduleService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schedule")
@CrossOrigin(origins = "http://localhost:3000/")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @PostMapping("/{courseName}")
    public ResponseEntity<?> addSchedule(@Valid @RequestBody ScheduleDto scheduleDto, @PathVariable String courseName){
        Schedule schedule = scheduleService.addSchedule(scheduleDto , courseName);
        return ResponseEntity.status(HttpStatus.CREATED).body(schedule);
    }

    @GetMapping("/{courseName}")
    public ResponseEntity<?> getSchedule(@PathVariable String courseName){
        return ResponseEntity.ok(scheduleService.getSchedule(courseName));

    }

    @PutMapping("/{courseName}")
    public ResponseEntity<?> editSchedule(@Valid @RequestBody ScheduleDto scheduleDto , @PathVariable String courseName ){
       scheduleService.editSchedule(scheduleDto , courseName);
       return ResponseEntity.ok("Schedule edited successfully");
    }

    @DeleteMapping("/{courseName}")
    public ApiResponse deleteSchedule(@Valid @RequestBody ScheduleDto scheduleDto){
        return new ApiResponse(scheduleService.deleteSchedule(scheduleDto.getId()));

    }
}
