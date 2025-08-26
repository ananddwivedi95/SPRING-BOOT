package com.anand.application.service;

import com.anand.application.Request.UserRequest;
import com.anand.application.dbOperation.UserDBOperation;
import com.anand.application.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserService {

    @Autowired
    UserDBOperation dbOperation;

    public String userRegistration(UserRequest request) {
        UserEntity entity = new UserEntity();
        entity.setEmail(request.getEmail());
        entity.setPassword(request.getPassword());
        entity.setUserName(request.getUserName());
        entity.setConfirmPassword(request.getConfirmPassword());

        Optional<UserEntity> response = dbOperation.getUserById(entity.getEmail());
        if(response.isPresent()) {
            return "existence"; // This should map to existence.jsp
        }
        String result = dbOperation.saveAll(entity);
        return "success".equals(result) ? "success" : "registration";
    }

    public String loginCheck(UserRequest request) {
        String gmail = request.getEmail();
        String password = request.getPassword();
        Optional<UserEntity> response = dbOperation.getUserByIdAndPassword(gmail, password);

        if(response.isPresent()) {
            return "loginSuccess"; // This should map to loginSuccess.jsp
        }
        return "loginFail"; // This should map to loginFail.jsp
    }
}