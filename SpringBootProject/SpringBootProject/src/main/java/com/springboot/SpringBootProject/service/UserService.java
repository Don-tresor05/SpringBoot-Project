package com.springboot.SpringBootProject.service;

import com.springboot.SpringBootProject.entity.User;
import com.springboot.SpringBootProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Create a new user
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Read all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Read a specific user by ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Update an existing user
    public User updateUser(Long id, User userDetails) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        return userRepository.save(user);
    }

    // Delete a user
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
