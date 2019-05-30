package com.exercise.foxclub_sql.services;

import com.exercise.foxclub_sql.repositories.PasswordAble;
import org.springframework.stereotype.Service;

@Service
public class PasswordServiceImp {

  private PasswordAble passwordAble;

  public PasswordServiceImp(PasswordAble passwordAble) {
    this.passwordAble = passwordAble;
  }


}
