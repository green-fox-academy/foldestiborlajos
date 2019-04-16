import java.sql.SQLOutput;
import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    divideTen(0);

  }
  public static int divideTen(int input) {
    try {
      int ret = 10 / input;
      return ret;
    } catch (ArithmeticException e) {

      System.out.println("fail: ");
      e.printStackTrace();
    }
    return -1;
  }
}
