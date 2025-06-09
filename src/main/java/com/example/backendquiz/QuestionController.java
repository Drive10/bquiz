package com.example.backendquiz;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class QuestionController {
  private final QuestionService questionService;

  @GetMapping
  public ResponseEntity<List<Question>> getQuestions(
      @RequestParam(required = false) String difficulty,
      @RequestParam(required = false) String category) {
    return ResponseEntity.ok(questionService.getQuestions(difficulty, category));
  }

  @PostMapping
  public ResponseEntity<Question> addQuestion(@RequestBody Question question) {
    return ResponseEntity.ok(questionService.addQuestion(question));
  }
}
