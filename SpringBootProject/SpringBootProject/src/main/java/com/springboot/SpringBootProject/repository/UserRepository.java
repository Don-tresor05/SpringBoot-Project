package com.springboot.SpringBootProject.repository;

import com.springboot.SpringBootProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
