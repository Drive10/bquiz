package com.example.backendquiz;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "questions")
@NoArgsConstructor
@AllArgsConstructor
public class Question {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "question_text", nullable = false)
  private String questionText;

  @Column(nullable = false)
  private String option1;

  @Column(nullable = false)
  private String option2;

  @Column(nullable = false)
  private String option3;

  @Column(nullable = false)
  private String option4;

  @Column(name = "correct_answer", nullable = false)
  private Integer correctAnswer;

  private String category;
  private String difficulty;
}
