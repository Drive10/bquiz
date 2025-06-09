package com.example.backendquiz;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {
  private final QuestionRepository questionRepository;

  public List<Question> getQuestions(String difficulty, String category) {
    if (difficulty != null && category != null) {
      return questionRepository.findByDifficultyAndCategory(difficulty, category);
    } else if (difficulty != null) {
      return questionRepository.findByDifficulty(difficulty);
    } else if (category != null) {
      return questionRepository.findByCategory(category);
    }
    return questionRepository.findAll();
  }

  public Question addQuestion(Question question) {
    return questionRepository.save(question);
  }
}
