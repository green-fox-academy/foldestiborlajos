package com.excercise.rest.model;

public class GreeterError extends Error {
  private String error1;
  private String error
  public GreeterError(){
    super();
  }



  @Override
  public String getError() {
    return error;
  }

  @Override
  public void setError(String error) {
    this.error = error;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
