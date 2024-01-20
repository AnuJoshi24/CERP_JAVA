package com.anupama.cerp.Controller;


import com.anupama.cerp.Dto.FeedbackDto;
import com.anupama.cerp.entities.Feedback;
import com.anupama.cerp.projection.FeedbackList;
import com.anupama.cerp.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
@CrossOrigin(origins = "http://localhost:3000/")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping("/{studentId}/{subjectName}")
    @PreAuthorize("hasAuthority('STUDENT')")
    public ResponseEntity<?> addFeedback(@PathVariable Long studentId , @PathVariable String subjectName , @RequestBody FeedbackDto feedbackDto){
        Feedback feedback = feedbackService.addFeedback(feedbackDto,studentId,subjectName);
        if(feedback!=null){
            return ResponseEntity.status(HttpStatus.CREATED).body("feedback");
        }else{
            return ResponseEntity.status(500).body("feedback is recorded already");
        }
    }

    @GetMapping("/{subjectName}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<?> showFeedback(@PathVariable String subjectName){
        List<FeedbackList> list = feedbackService.showFeedback(subjectName);
        if(list!=null){
            return ResponseEntity.ok(list);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Invalid Subject Name , Try Again ! ");
        }
    }

}
