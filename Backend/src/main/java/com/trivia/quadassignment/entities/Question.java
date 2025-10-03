package com.trivia.quadassignment.entities;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import java.util.List;

@Entity
@AllArgsConstructor
public class Question {

    public enum Difficulty {
        EASY, MEDIUM, HARD
    }

    private Long id;
    private String questionType;
    private Difficulty questionDifficulty;
    private String questionCategory;
    private String question;
    private String correctAnswer;
    private List<String> incorrectAnswers;
}