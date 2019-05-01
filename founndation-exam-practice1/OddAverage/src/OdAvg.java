import java.util.ArrayList;

public class OdAvg {

  public static void main(String[] args) {

  }

  public static int odAvg(ArrayList<Integer> inputList) {
    int counterOfOdds = 0;
    int sumOfOdds = 0;
    for (Integer i : inputList) {
      if (i % 2 != 0) {
        sumOfOdds += i;
        counterOfOdds ++;
      }
    }
    return counterOfOdds/sumOfOdds;
  }

}
