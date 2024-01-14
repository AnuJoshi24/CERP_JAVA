package com.anupama.cerp.entities;
// one student can give only one feedback of each subject

import jakarta.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback extends BaseEntity{

    @OneToOne(fetch = FetchType.LAZY) // only when needed then it will be loaded
    @JoinColumn(name = "student_id")
    private Student student;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id")
    private Subject subject;

    private int knowledge ;
    private int communication ;
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public int getCommunication() {
        return communication;
    }

    public void setCommunication(int communication) {
        this.communication = communication;
    }

    public int getPunctuality() {
        return punctuality;
    }

    public void setPunctuality(int punctuality) {
        this.punctuality = punctuality;
    }

    public int getTeaching() {
        return teaching;
    }

    public void setTeaching(int teaching) {
        this.teaching = teaching;
    }

    public int getGuidance() {
        return guidance;
    }

    public void setGuidance(int guidance) {
        this.guidance = guidance;
    }

    public String getSuggestion() {
        return suggestion;
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
