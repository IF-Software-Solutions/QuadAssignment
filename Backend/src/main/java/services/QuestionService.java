package services;

import entities.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import repositories.QuestionRepository;

import java.util.List;

@Service
public class QuestionService {

    @Value("${trivia.api.base-url}")
    private String triviaApiBaseUrl;

    private final QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestions(){
        return questionRepository.findAll();
    }

    public List<Question> getRandomquestions(int amount) {

    }
}
