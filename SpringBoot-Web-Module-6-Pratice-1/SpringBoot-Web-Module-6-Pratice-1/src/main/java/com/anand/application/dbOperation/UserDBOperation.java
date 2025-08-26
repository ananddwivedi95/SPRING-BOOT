package com.anand.application.dbOperation;

import com.anand.application.entity.UserEntity;
import com.anand.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserDBOperation {

    @Autowired
    UserRepository userRepository;

    public Optional<UserEntity> getUserById(String id)
    {
       return userRepository.findById(id);
    }

    public String saveAll(UserEntity entity)
    {
        userRepository.save(entity);
        return "success";
    }

    public Optional<UserEntity> getUserByIdAndPassword(String email,String password)
    {
        return userRepository.findByEmailAndPassword(email,password);
    }
}