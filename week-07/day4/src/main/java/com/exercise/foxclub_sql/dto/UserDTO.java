package com.exercise.foxclub_sql.dto;

import com.exercise.foxclub_sql.models.User;

public class UserDTO {
  private String email;

  public UserDTO(User user) {
    this.email = user.getEmail();
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
