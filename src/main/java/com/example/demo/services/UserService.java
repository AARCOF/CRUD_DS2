package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.UserModel;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<UserModel> getUser(){
        return userRepository.findAll();
    }

    public void save(UserModel user){
        userRepository.save(user);
    }

    public void deleteById(Integer id){
        userRepository.deleteById(id);
    }

}
