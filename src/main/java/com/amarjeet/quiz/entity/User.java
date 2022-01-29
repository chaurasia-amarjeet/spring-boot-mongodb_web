package com.amarjeet.quiz.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
@Document("users")
public class User {
    @MongoId
    private Long id;
    private String name;
    private Integer age;
    private Address address;
}
