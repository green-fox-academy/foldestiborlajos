public class Sharpie2 {
  String color;
  float width;
  int inkAmount = 100;
  boolean usable;

  public Sharpie2(String color, float width){
    this.color = color;
    this.width = width;
  }

  public int inkAmountToDecrease(){
    return inkAmount --;
  }
}
