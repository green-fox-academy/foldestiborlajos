package com.excercise.rest.service;

import com.excercise.rest.model.Number;
import org.springframework.stereotype.Service;

@Service
public class Until {

  public Until(){

  }

  public Number sum(Number hi){
    int result = 0;
    for(int i = 0; i <= hi.getNumber(); i++){
       result += i;
    }

    Number resultNumber = new Number();
    resultNumber.setNumber(result);
    return resultNumber;
  }

  public Number factor(Number number){
    int result = 1;
    for(int i = 1; i <= number.getNumber(); i++){
     result = result *= i;
    }

    Number resultNumber = new Number();
    resultNumber.setNumber(result);
    return resultNumber;
  }
}
