package com.trivia.quadassignment.controllers;

import com.trivia.quadassignment.entities.Question;
import org.springframework.web.bind.annotation.*;
import com.trivia.quadassignment.services.QuestionService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService){
        this.questionService = questionService;
    }

    @GetMapping("/questions/{amount}")
    public List<Question> getRandomQuestions(@PathVariable int amount){
        return questionService.getQuestions(amount);
    }
}
