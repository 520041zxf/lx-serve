package com.example.demo.entity.po;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SystemUsers {
  private Long userId;
  private String username;
  private String passwordHash;
  private String fullName;
  private String role;
  private String email;
  private String phone;
  private String department;
  private LocalDateTime lastLogin;
  private Long isActive;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}
