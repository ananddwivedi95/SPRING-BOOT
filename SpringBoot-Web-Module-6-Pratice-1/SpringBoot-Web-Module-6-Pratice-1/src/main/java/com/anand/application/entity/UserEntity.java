package com.anand.application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

//entity class
@Getter
@Entity
@Table(name="UserData")
public class UserEntity {

    @Id
    private String email;
    private String userName;
    private String password;
    private String confirmPassword;


    public UserEntity() {

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
