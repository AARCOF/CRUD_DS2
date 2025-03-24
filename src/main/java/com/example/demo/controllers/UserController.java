package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.UserModel;
import com.example.demo.services.UserService;

@RestController
@RequestMapping(path = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping()
    public List<UserModel> getAll(){
        return userService.getUser();
    }

    @PostMapping()
    public void save(@RequestBody UserModel userModel){
        userService.save(userModel);
    }

    @DeleteMapping("/{userId}")
    public void delete(@PathVariable("userId") Integer id){
        userService.deleteById(id);
    }
}
