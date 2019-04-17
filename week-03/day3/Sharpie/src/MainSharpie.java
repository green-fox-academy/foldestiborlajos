public class MainSharpie {
  public static void main(String[] args) {

    Sharpie sharpie1 = new Sharpie("blue",12.23545F);

    for (int i = sharpie1.inkAmount; i > 50; i--){
      sharpie1.inkAmountToDecrease();
      System.out.println("Ink Amount :" + sharpie1.inkAmount);
    }

  }
}
