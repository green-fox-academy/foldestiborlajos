package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  protected int numberOfString;

  public ElectricGuitar(){
    numberOfString = 6;
  }

  public ElectricGuitar (int numberOfString){
    super(numberOfString);
  }

  public void sound(){
    System.out.println("Twang");
  }
  public void play(){
    this.sound();
  }
}
