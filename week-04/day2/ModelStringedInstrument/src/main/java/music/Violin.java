package main.java.music;

public class Violin extends StringedInstrument {
  protected int numberOfString;

  public Violin(){
    this.numberOfString = 4;
  }

  public Violin (int numberOfString){
    super(numberOfString);
  }


  public void sound() {
    System.out.println("Screech");
  }

  @Override
  public void play() {
    this.sound();
  }
}
