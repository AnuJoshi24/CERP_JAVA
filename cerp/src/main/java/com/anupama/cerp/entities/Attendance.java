package com.anupama.cerp.entities;
// one student can have many attendance of each subject

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import org.hibernate.validator.constraints.Range;

@Getter
@Entity
public class Attendance extends BaseEntity {
    @Range(min = 0, max = 100, message = "Attendance percentage should be between 0 to 100")
    private int attendance;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @JsonIgnore
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    @JsonIgnore
    private Subject subject;

    public Attendance() {
        super();
    }

    public Attendance(@Range(min = 0, max = 100, message = "Attendance percentage should be between 0 to 100") int attendance,
                      Student student, Subject subject) {
        this.attendance = attendance;
        this.student = student;
        this.subject = subject;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "attendance=" + attendance +
                ", student=" + student +
                ", subject=" + subject +
                '}';
    }
}
