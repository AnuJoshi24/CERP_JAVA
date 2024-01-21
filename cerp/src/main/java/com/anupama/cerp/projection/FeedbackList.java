package com.anupama.cerp.projection;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class FeedbackList implements Serializable {
    private long studentId;
    private int knowledge;
    private int communication;
    private int punctuality;
    private int teaching;
    private int guidance;
    private String suggestion;

    public FeedbackList() {
        super();
    }

    public FeedbackList(long studentId, int knowledge, int communication, int punctuality, int teaching, int guidance, String suggestion) {
        this.studentId = studentId;
        this.knowledge = knowledge;
        this.communication = communication;
        this.punctuality = punctuality;
        this.teaching = teaching;
        this.guidance = guidance;
        this.suggestion = suggestion;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
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
        return "FeedbackList{" +
                "studentId=" + studentId +
                ", knowledge=" + knowledge +
                ", communication=" + communication +
                ", punctuality=" + punctuality +
                ", teaching=" + teaching +
                ", guidance=" + guidance +
                ", suggestion='" + suggestion + '\'' +
                '}';
    }
}
