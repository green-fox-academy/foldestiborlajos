package com.excercise.rest.model;

public class Append {

  private String appended;

  public Append(String input) {
    this.appended = input + "a";

  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appenda) {
    this.appended = appenda;
  }
}
