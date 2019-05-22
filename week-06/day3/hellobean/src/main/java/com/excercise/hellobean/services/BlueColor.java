package com.excercise.hellobean.services;

import com.excercise.hellobean.interfaces.MyColorable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("blue")
public class BlueColor implements MyColorable {

  @Override
  public String printColor() {
    return "It is blue...";
  }
}
