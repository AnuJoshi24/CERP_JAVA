package com.anupama.cerp.service;

import com.anupama.cerp.Dto.FeedbackDto;
import com.anupama.cerp.entities.Feedback;
import com.anupama.cerp.projection.FeedbackList;

import java.util.List;

public interface FeedbackService {
 Feedback addFeedback(FeedbackDto feedbackDto , Long studentId , String subjectName);
 Feedback getFeedbackById(Long id);

 List<FeedbackList> showFeedback(String subjectName);
}
