package com.example.groot.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class Ship {

  @JsonIgnore
  private final int cargoMax;
  private int caliber10;
  private int caliber30;
  private int caliber50;
  private String shipStatus;
  private boolean ready;

  public Ship() {
    this.cargoMax = 12500;
  }

  public int getCargoMax() {
    return cargoMax;
  }

  public int getCaliber10() {
    return caliber10;
  }


  public void setCaliber10(int caliber10) {
    this.caliber10 = caliber10;
  }

  public int getCaliber30() {
    return caliber30;
  }

  public void setCaliber30(int caliber30) {
    this.caliber30 = caliber30;
  }

  public int getCaliber50() {
    return caliber50;
  }

  public void setCaliber50(int caliber50) {
    this.caliber50 = caliber50;
  }

  public String getShipStatus() {
    return shipStatus;
  }

  public void setShipStatus(String shipStatus) {
   this.shipStatus =shipStatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReady(Boolean ready) {
    this.ready = ready;
  }
}
