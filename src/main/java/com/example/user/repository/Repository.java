package com.example.user.repository;


import com.example.user.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface Repository extends JpaRepository<User, Long> {
}
