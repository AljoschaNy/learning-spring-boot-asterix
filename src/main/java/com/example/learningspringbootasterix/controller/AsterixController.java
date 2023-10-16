package com.example.learningspringbootasterix.controller;

import com.example.learningspringbootasterix.model.Character;
import com.example.learningspringbootasterix.service.AsterixService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/asterix")
@RequiredArgsConstructor
public class AsterixController {
    private final AsterixService asterixService;
    @GetMapping("/character")
    public List<Character> getAllCharacters() {
        return asterixService.getAllCharacters();
    }
}
