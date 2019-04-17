public class Sharpie {
  String color;
  float width;
  int inkAmount = 100;

  public Sharpie(String color, float width){
    this.color = color;
    this.width = width;
  }

  public int inkAmountToDecrease(){
   return inkAmount --;
  }
}
