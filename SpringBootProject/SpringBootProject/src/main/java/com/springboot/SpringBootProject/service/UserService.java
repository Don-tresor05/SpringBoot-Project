package com.springboot.SpringBootProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
// import com.springboot.SpringBootProject.HelloController;
import com.springboot.SpringBootProject.dto.UserDTO;

@Service
public class UserService {

    
    private final List<UserDTO> users = new ArrayList<>();

    
    public UserDTO addUser(UserDTO user){
        users.add(user);
        return user;
    }

    public List<UserDTO> getAllUsers(){
        return users;
    }
    
}
