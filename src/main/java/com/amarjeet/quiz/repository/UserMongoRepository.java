package com.amarjeet.quiz.repository;

import com.amarjeet.quiz.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserMongoRepository extends MongoRepository<User, Long> {
    List<User> findByName(String name);
    List<User> findByNameAndAge(String name, Integer age);
    List<User> findByNameStartingWith(String name);
    List<User> findByNameContains(String name);
    List<User> findByAgeEquals(Integer age);
}
