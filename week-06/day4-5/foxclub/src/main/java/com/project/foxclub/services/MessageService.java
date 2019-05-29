package com.project.foxclub.services;

import com.project.foxclub.model.Fox;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

  private boolean alreadyExist = false;

  public String sendWrongPasswordMessage() {
    return "Your has gave a wrong password. Concentrate, and try again.";
  }

  public String sendAlreadyExisitngFoxMessage() {
    return "We at the Fox Club respect individuality. This fox already exist."
        + "Please create an other one";
  }

  public String sendEmptyTrickListMessage(String inputFoxName){
    return " It seems " + inputFoxName + " unable to do any tricks. That's not that impressive.";
  }

  public boolean isAlreadyExist() {
    return alreadyExist;
  }

  public void setAlreadyExist(boolean alreadyExist) {
    this.alreadyExist = alreadyExist;
  }

}
