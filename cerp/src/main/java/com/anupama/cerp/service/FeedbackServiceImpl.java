package com.anupama.cerp.service;

import com.anupama.cerp.Dto.FeedbackDto;
import com.anupama.cerp.custom_exceptions.EntityNotFoundException;
import com.anupama.cerp.entities.Feedback;
import com.anupama.cerp.entities.Student;
import com.anupama.cerp.entities.Subject;
import com.anupama.cerp.projection.FeedbackList;
import com.anupama.cerp.repository.FeedbackRepository;
import com.anupama.cerp.repository.StudentRepository;
import com.anupama.cerp.repository.SubjectRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class FeedbackServiceImpl implements FeedbackService{
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public Feedback addFeedback(FeedbackDto feedbackDto, Long studentId, String subjectName) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(()-> new EntityNotFoundException("Student not found with id:" + studentId));
        Subject subject = subjectRepository.findBySubjectName(subjectName);
        if(subject == null){
            throw  new EntityNotFoundException("Subject not found with name : " + subjectName);
        }

        Feedback fd = feedbackRepository.findByStudentAndSubject(student,subject);
        Feedback feedback = new Feedback();
        if(fd == null){
            feedback.setKnowledge(feedbackDto.getKnowledge());
            feedback.setCommunication(feedbackDto.getCommunication());
            feedback.setGuidance(feedbackDto.getGuidance());
            feedback.setPunctuality(feedbackDto.getPunctuality());
            feedback.setTeaching(feedbackDto.getTeaching());
            feedback.setSuggestion(feedbackDto.getSuggestion());

            feedback.setStudent(student);
            feedback.setSubject(subject);
            return feedbackRepository.save(feedback);
        }else{
            return null;
        }

    }

    @Override
    public Feedback getFeedbackById(Long id) {
        return feedbackRepository.findById(id).orElse(null);
    }

    @Override
    public List<FeedbackList> showFeedback(String subjectName) {
        return feedbackRepository.findAllBySubjectNameAndSortedById(subjectName);
    }
}
