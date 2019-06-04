package com.example.groot.model;

public class TranslatedMessage {

  private String received;
  private final String translated;

  public TranslatedMessage() {
    this.translated = "I am Groot!";
  }

  public TranslatedMessage(String received) {
    this.received = received;
    this.translated = "I am Groot!";
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }
}
