package com.example.learningspringbootasterix.repository;

import com.example.learningspringbootasterix.model.Character;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepo extends MongoRepository<Character,String> {

}
