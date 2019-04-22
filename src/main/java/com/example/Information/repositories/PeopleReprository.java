package com.example.Information.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Information.Models.People;

public interface PeopleReprository extends MongoRepository<People, String>{
    
	People findBy_id(ObjectId _id);
}