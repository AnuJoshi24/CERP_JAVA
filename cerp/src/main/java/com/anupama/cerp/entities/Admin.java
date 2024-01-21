package com.anupama.cerp.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
@Entity // it is part of javax.persistence package , Used at class level  , marks the class as persistent entity
//Signals JPA provider that class should be treated as table in db
// Spring Boot JPA is a Java specification for managing relational data in Java applications. It allows us to access and persist data between Java object/ class and relational database. JPA follows Object-Relation Mapping (ORM). It is a set of interfaces.
public class Admin extends BaseEntity {

    @Column(length = 30, unique = true)
    @NotBlank(message = "email is required")
    @Email(message = "Invalid Email Address")
    private String email;
    @Column(length = 20, nullable = false)
    @NotBlank(message = "password is required")
    @Size(min = 6, message = "password should have atleast 6 chars")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{6,20})", message = "Invalid Password!")
    private String password;

    public Admin() {
        super();
    }

    public Admin(@NotBlank(message = "email is required") @Email(message = "Invalid Email Address") String email,
                 @NotBlank(message = "passowrd is required") @Size(min = 6, message = "password shoudl have atleast 6 charcters") @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{6,20})", message = "Invalid Password!") String password) {
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
        return "Admin{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
