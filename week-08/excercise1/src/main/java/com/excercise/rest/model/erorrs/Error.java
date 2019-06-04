package com.excercise.rest.model;

public abstract class Error {
  private String error;

  public Error(){
    error="Please provide an input!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
