package com.anupama.cerp.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

@Entity
public class Student extends BaseEntity implements Serializable {

    @Column(length = 20)
    @NotBlank(message = "First Name is required")
    @Size(min = 2, max = 20, message = "First Name must be between 2 and 20 char")
    private String firstName;
    @Column(length = 20)
    private String lastName;
    @Column(length = 30, unique = true)
    @NotBlank(message = "email is required")
    @Email(message = "Invalid email address")
    private String email;
    @NotBlank(message = "Gender should not be blank")
    private String gender;
    @Column(length = 20, nullable = false)
    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "password must have at least 6 characters")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{6,20})", message = "Invalid Password!")
    private String password;
    @Column(length = 50)
    private String address;


    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Student() {
        super();
    }

    public Student(@NotBlank(message = "First name is required") @Size(min = 2, max = 20, message = "first name must be between 2 to 20 chars") String firstName,
                   String lastName,
                   @NotBlank(message = "Email is required") @Email(message = "Invalid Email Address") String email,
                   @NotBlank(message = "Gender should not be blank") String gender,
                   @NotBlank(message = "password is required") @Size(min = 6, message = "password should have atl east 6 char") @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{6,20})", message = "Invalid Password!") String password,
                   String address, Course course) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.password = password;
        this.address = address;
        this.course = course;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", course=" + course +
                '}';
    }
}
