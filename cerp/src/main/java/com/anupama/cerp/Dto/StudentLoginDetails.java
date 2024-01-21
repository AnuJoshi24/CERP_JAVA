package com.anupama.cerp.Dto;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class StudentLoginDetails implements Serializable {
    private String email;
    private String password;

    public StudentLoginDetails() {
        super();
    }

    public StudentLoginDetails(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "StudentLoginDetails{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
