package com.anupama.cerp.entities;
// one student can give only one feedback of each subject

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "feedback")
public class Feedback extends BaseEntity {

    @OneToOne(fetch = FetchType.LAZY) // only when needed then it will be loaded
    @JoinColumn(name = "student_id")
    private Student student;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id")
    private Subject subject;

    private int knowledge;
    private int communication;
    private int punctuality;
    private int teaching;
    private int guidance;

    private String suggestion;

    public Feedback() {
        super();
    }

    public Feedback(Student student, Subject subject, int knowledge, int communication, int punctuality, int teaching, int guidance, String suggestion) {
        this.student = student;
        this.subject = subject;
        this.knowledge = knowledge;
        this.communication = communication;
        this.punctuality = punctuality;
        this.teaching = teaching;
        this.guidance = guidance;
        this.suggestion = suggestion;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public void setCommunication(int communication) {
        this.communication = communication;
    }

    public void setPunctuality(int punctuality) {
        this.punctuality = punctuality;
    }

    public void setTeaching(int teaching) {
        this.teaching = teaching;
    }

    public void setGuidance(int guidance) {
        this.guidance = guidance;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "student=" + student +
                ", subject=" + subject +
                ", knowledge=" + knowledge +
                ", communication=" + communication +
                ", punctuality=" + punctuality +
                ", teaching=" + teaching +
                ", guidance=" + guidance +
                ", suggestion='" + suggestion + '\'' +
                '}';
    }
}
