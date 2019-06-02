package com.excercise.reddit.service;

import com.excercise.reddit.model.Password;

public interface PasswordService {

  public Password findByUser(Long userId);
  public void save();
  public boolean validatePassword(String inputPassword);

}
