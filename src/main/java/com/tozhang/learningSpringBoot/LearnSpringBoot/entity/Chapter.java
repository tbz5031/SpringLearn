package com.tozhang.learningSpringBoot.LearnSpringBoot.entity;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data  //The @Data annotation from Lombok generates getters, setters, a toString() method, an equals() method, a hashCode() method, and a constructor for all required (that is, final) fields
@Document   //The @Document annotation flags this class as suitable for storing in a MongoDB data store
public class Chapter {
    @Id  //The id field is marked with Spring Data's @Id annotation, indicating this is the primary key of our Mongo document
    private String id;
    private String name;

    //Spring Data MongoDB will, by default, create a collection named chapters with two fields, id and name
    public Chapter(String name) {
        this.name = name;
    }
}
