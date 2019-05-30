package com.exercise.foxclub_sql.services;

import com.exercise.foxclub_sql.repositories.Useable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp {

  private Useable useable;

  public UserServiceImp(Useable useable){
    this.useable=useable;
  }

}
