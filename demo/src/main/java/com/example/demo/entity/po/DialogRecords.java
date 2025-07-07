package com.example.demo.entity.po;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DialogRecords {
  private Long dialogId;
  private String studentId;
  private String sessionId;
  private LocalDateTime dialogTime;
  private String userInput;
  private String aiResponse;
  private Double sentimentScore;
  private Long riskFlag;
  private String keywords;
  private LocalDateTime createdAt;
}
