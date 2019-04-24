package main.java.music;

public abstract class StringedInstrument extends Instrument implements ISoundable {
  protected int numberOfString;

  public StringedInstrument(){}

  public StringedInstrument(int numberOfString){
    this.numberOfString = numberOfString;
  }

  public void sound(){

  }
}
