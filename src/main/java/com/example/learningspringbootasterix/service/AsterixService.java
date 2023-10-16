package com.example.learningspringbootasterix.service;

import com.example.learningspringbootasterix.model.Character;
import com.example.learningspringbootasterix.repository.CharacterRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AsterixService {
    private final CharacterRepo characterRepo;

    public List<Character> getAllCharacters() {
        return characterRepo.findAll();
    }
}
