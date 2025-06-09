package com.example.backendquiz;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
  List<Question> findByDifficultyAndCategory(String difficulty, String category);

  List<Question> findByDifficulty(String difficulty);

  List<Question> findByCategory(String category);
}
