package com.exercise.foxclub_sql.services;

import org.springframework.stereotype.Component;

@Component
public class MessageService {

  private boolean alreadyExist = false;

  public String sendWrongPasswordMessage() {
    return "Your has gave a wrong password. Concentrate please and try again.";
  }

  public String sendAlreadyExisitngFoxMessage() {
    return "We at the Fox Club respect individuality. Fortunately this fox already exist."
        + "Please create an other one. Or you can try to build a friendship with a fox.";
  }

  public String sendNotRegisteredMessage(){

    return "It seems that you haven't got a Fox Club account. If you like to have one. Please register.";
  }

  public boolean isAlreadyExist() {
    return alreadyExist;
  }

  public void setAlreadyExist(boolean alreadyExist) {
    this.alreadyExist = alreadyExist;
  }

}
