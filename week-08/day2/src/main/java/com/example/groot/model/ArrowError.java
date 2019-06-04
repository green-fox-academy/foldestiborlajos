package com.example.groot.model;

public class ArrowError {
  private String error;


  public ArrowError() {
    error = "Please provide both time and distance";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
