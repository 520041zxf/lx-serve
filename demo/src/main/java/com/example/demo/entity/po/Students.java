package com.example.demo.entity.po;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Students {
  private String studentId;
  private String name;
  private String gender;
  private String classId;
  private Long counselorId;
  private String contactPhone;
  private String emergencyContact;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}
