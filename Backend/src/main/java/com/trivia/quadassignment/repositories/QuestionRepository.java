package com.trivia.quadassignment.repositories;

import com.trivia.quadassignment.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Long> {
}
