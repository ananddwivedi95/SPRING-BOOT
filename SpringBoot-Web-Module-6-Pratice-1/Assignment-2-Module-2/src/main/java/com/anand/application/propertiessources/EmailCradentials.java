package com.anand.application.propertiessources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailCradentials {

    @Value("${email.crediential.username}")
    private String username;

    @Value("${email.crediential.password}")
    private String password;

    public EmailCradentials() {
        System.out.println("EmailCradentials bean is created");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "EmailCradentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
