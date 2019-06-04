package com.example.groot.model;

public class ShipError {
  private String error;

  public ShipError() {
    this.error = "Please give caliber and amount";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
