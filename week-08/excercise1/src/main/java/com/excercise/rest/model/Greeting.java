package com.excercise.rest.model;

public class Greeting {
  private String welcome_message;

  public Greeting(){

  }

  public Greeting(String name, String title) {
    this.welcome_message = "Oh, hi there " + name + ", my dear " + title +" !";
  }

  public String get_welcome_message() {
    return welcome_message;
  }

  public void setwelcome_message(String name, String title) {
    this.welcome_message = "Oh, hi there " + name + ", my dear " + title +" !";}
}

