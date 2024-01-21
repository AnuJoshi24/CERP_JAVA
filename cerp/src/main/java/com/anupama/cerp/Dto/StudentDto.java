package com.anupama.cerp.Dto;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class StudentDto implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String gender;
    private String address;
    private Long courseId;

    public StudentDto() {
        super();
    }

    public StudentDto(String firstName, String lastName, String email, String password, String gender, String address, Long courseId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.address = address;
        this.courseId = courseId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", courseId=" + courseId +
                '}';
    }
}
