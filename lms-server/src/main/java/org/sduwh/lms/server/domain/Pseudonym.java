package org.sduwh.lms.server.domain;

import lombok.Data;

@Data
public class Pseudonym {
  private Long id;
  private String userName;
  private String cryptedPassword;
  private User user;
}
