package com.trivia.quadassignment.services;

import com.trivia.quadassignment.entities.Question;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;
import java.util.List;


@Service
public class QuestionService {

    private final WebClient webClient;

    public QuestionService(WebClient webClient) {
        this.webClient = webClient;
    }

    public List<Question> getQuestions(int amount){
        try{
            return webClient.get().uri(uriBuilder -> uriBuilder.queryParam("amount", amount).queryParam("type", "multiple").build()).retrieve().bodyToMono(Question.class).block();
        }catch(Exception e){
            return ("Error message: " + e.getMessage());
        }
    }

}