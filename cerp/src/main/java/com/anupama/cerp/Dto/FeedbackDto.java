package com.anupama.cerp.Dto;

public class FeedbackDto {
    private int knowledge;
    private int communication;
    private int punctuality;
    private int teaching;
    private  int guidance;
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
