package com.excercise.rest.model.erorrs;

public class UntilError {
  String error;

  public UntilError(){
    this.error = "Please provide a number!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
