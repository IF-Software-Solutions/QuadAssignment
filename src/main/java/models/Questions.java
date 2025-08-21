package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;

import java.util.List;


@Getter
@Setter
@Entity
@AllArgsConstructor
public class Questions {

    private String qType;
    private String qDifficulty;
    private String qCategory;
    private String question;
    private String correct_answer;
    private List<String> incorrect_answer;

    @Override
    public String toString() {
        return "Questions{" +
                "qType='" + qType + '\'' +
                ", qDifficulty='" + qDifficulty + '\'' +
                ", qCategory='" + qCategory + '\'' +
                ", question='" + question + '\'' +
                ", correct_answer='" + correct_answer + '\'' +
                ", incorrect_answer=" + incorrect_answer +
                '}';
    }
}
