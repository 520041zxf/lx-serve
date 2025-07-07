package com.example.demo.entity.po;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class PsychAssessments {
  private Long assessmentId;
  private String studentId;
  private LocalDate assessmentDate;
  private Long emotionStability;
  private Long socialActivity;
  private Long academicPressure;
  private Long sleepQuality;
  private Long selfCognition;
  private Long overallScore;
  private String riskLevel;
  private LocalDateTime createdAt;
}
