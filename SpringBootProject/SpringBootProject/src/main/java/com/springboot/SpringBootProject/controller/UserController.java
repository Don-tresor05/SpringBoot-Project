package com.springboot.SpringBootProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import com.springboot.SpringBootProject.HelloController;
import com.springboot.SpringBootProject.dto.UserDTO;
import com.springboot.SpringBootProject.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    
    
    @Autowired
    private UserService userService;

   

    @PostMapping
    public UserDTO addUser(@RequestBody UserDTO user){
        return userService.addUser(user);
    }

    @GetMapping
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }
}
