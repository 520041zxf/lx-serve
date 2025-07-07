package com.example.demo.entity.po;


import lombok.Data;

import java.time.LocalDateTime;
import java.time.LocalTime;
@Data
public class AlertEvents {
  private String eventId;
  private String studentId;
  private LocalDateTime alertTime;
  private String alertLevel;
  private String triggerSource;
  private Double riskScore;
  private String content;
  private Long handled;
  private Long handlerId;
  private LocalDateTime handledTime;
  private String followUpNotes;
  private LocalDateTime createdAt;
}
