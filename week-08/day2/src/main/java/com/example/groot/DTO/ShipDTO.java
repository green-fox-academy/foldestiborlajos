package com.example.groot.DTO;

public class ShipDTO {
  private String recieved;
  private int amount;
  private String shipSatus;
  private boolean ready;

  public ShipDTO(){}

  public ShipDTO(String recieved, int amount, String shipSatus, boolean ready) {
    this.recieved = recieved;
    this.amount = amount;
    this.shipSatus = shipSatus;
    this.ready = ready;
  }

  public String getRecieved() {
    return recieved;
  }

  public void setRecieved(String recieved) {
    this.recieved = recieved;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getShipSatus() {
    return shipSatus;
  }

  public void setShipSatus(String shipSatus) {
    this.shipSatus = shipSatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }
}
