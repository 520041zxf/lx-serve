package com.example.demo.entity.po;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BehaviorLogs {
  private Long logId;
  private String studentId;
  private LocalDateTime logTime;
  private String logType;
  private String status;
  private Long duration;
  private String location;
  private String additionalInfo;
  private LocalDateTime createdAt;
}
