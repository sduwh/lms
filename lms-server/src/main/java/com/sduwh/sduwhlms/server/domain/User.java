package com.sduwh.sduwhlms.server.domain;

import lombok.Data;

@Data
public class User {
  private Long id;
  private String name;
  private Gender gender;
  private String email;
  private String avatarUrl;
  private String schoolName;
  private String stuId;
  private Role role;

  public static enum Gender {
    GRIL,
    BOY
  }
}
