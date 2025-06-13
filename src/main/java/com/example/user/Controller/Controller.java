package com.example.user.Controller;


import com.example.user.Entity.User;
import com.example.user.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class Controller {
    @Autowired
    private Repository repository;


    @GetMapping("/all")
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
        return repository.save(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}