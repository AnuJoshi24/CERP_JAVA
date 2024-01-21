package com.anupama.cerp.Dto;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class FeedbackDto implements Serializable {
    private int knowledge;
    private int communication;
    private int punctuality;
    private int teaching;
    private int guidance;
    private String suggestion;

    public FeedbackDto() {
        super();
    }

    public FeedbackDto(int knowledge, int communication, int punctuality, int teaching, int guidance, String suggestion) {
        this.knowledge = knowledge;
        this.communication = communication;
        this.punctuality = punctuality;
        this.teaching = teaching;
        this.guidance = guidance;
        this.suggestion = suggestion;
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
        return "FeedbackDto{" +
                "knowledge=" + knowledge +
                ", communication=" + communication +
                ", punctuality=" + punctuality +
                ", teaching=" + teaching +
                ", guidance=" + guidance +
                ", suggestion='" + suggestion + '\'' +
                '}';
    }
}
