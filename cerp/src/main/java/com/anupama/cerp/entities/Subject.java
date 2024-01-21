package com.anupama.cerp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
@Entity
public class Subject extends BaseEntity {
    @NotBlank(message = "subject name is required")
    private String subjectName;

    @ManyToOne
    @JoinColumn(name = "course_id")
    @JsonIgnore
    private Course course;

    public Subject() {
        super();
    }

    public Subject(@NotBlank(message = "subject name is required") String subjectName, Course course) {
        super();
        this.subjectName = subjectName;
        this.course = course;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", course=" + course +
                '}';
    }
}
