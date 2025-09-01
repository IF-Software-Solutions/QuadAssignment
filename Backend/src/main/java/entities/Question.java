package entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Question {

    public enum difficulty {
        easy, medium, hard
    }

    private String questionType;
    private String questionDifficulty;
    private Category questionCategory;
    private String question;
    private String correctAnswer;
    private List<String> incorrectAnswers;

    @Override
    public String toString() {
        return "Question{" +
                "questionType='" + questionType + '\'' +
                ", questionDifficulty='" + questionDifficulty + '\'' +
                ", questionCategory=" + questionCategory +
                ", question='" + question + '\'' +
                ", correctAnswer='" + correctAnswer + '\'' +
                ", incorrectAnswers=" + incorrectAnswers +
                '}';
    }
}
