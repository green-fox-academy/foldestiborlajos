package main.java.music;

public class BassGuitar extends StringedInstrument {
  protected int numberOfString;

  public BassGuitar (){
    this.numberOfString = 4;
  }

  public BassGuitar (int numberOfString){
    super(numberOfString);
  }

  public void sound() {
    System.out.println("Dumm-dumm-dumm");
  }

  public void play(){
    this.sound();
  }
}
