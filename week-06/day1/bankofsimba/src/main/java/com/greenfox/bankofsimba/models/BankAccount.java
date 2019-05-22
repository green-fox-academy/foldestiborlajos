package com.greenfox.bankofsimba.models;

public class BankAccount {

  private String name;
  private Integer balance;
  private String animalType;
  private boolean isKing;
  private boolean isGood;

  public BankAccount(String name, Integer balance, String animalType, boolean isKing, boolean isGood) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isGood= isGood;
  }

  public BankAccount(){

  }

  public BankAccount(String name, Integer balance, String animalType){
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = false;
    this.isGood= false;
  }


  public boolean isGood() {
    return isGood;
  }

  public void setGood(boolean good) {
    isGood = good;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }
}
