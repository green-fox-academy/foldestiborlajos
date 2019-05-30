package com.exercise.foxclub_sql.services;

import com.exercise.foxclub_sql.repositories.FoxAble;
import org.springframework.stereotype.Service;

@Service
public class FoxServiceImpl {

  private FoxAble foxAble;

  public FoxServiceImpl(FoxAble foxAble){
    this.foxAble=foxAble;
  }

}
