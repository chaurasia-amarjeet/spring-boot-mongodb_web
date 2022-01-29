package com.amarjeet.quiz.controller;

import com.amarjeet.quiz.entity.User;
import com.amarjeet.quiz.repository.UserMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserMongoRepository userMongoRepository;

    @Autowired
    public UserController(UserMongoRepository userMongoRepository) {
        this.userMongoRepository = userMongoRepository;
    }

    @GetMapping("users")
    public List<User> getUsers(){
        return userMongoRepository.findAll();
    }

    @GetMapping("user/{id}")
    public User getUsers(@PathVariable Long id){
        return userMongoRepository.findById(id).get();
    }

    @GetMapping("user/name/{name}")
    public List<User> getUserByName(@PathVariable String name){
        return userMongoRepository.findByName(name);
    }

    @GetMapping("user/name/{name}/age/{age}")
    public List<User> getUserByNameAndAge(@PathVariable String name, @PathVariable Integer age){
        return userMongoRepository.findByNameAndAge(name, age);
    }

    @GetMapping("user/age/{age}")
    public List<User> getUserByAge(@PathVariable Integer age){
        return userMongoRepository.findByAgeEquals(age);
    }

    @PostMapping("users")
    public User addUser(@RequestBody User user){
        return userMongoRepository.save(user);
    }

    @PutMapping("user")
    public User updateUsers(@RequestBody User user){
        return userMongoRepository.save(user);
    }

    @DeleteMapping("user/{id}")
    public void removeUser(@PathVariable Long id){
        userMongoRepository.deleteById(id);
    }
}
