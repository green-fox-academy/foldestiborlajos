import java.lang.reflect.Array;
import java.util.Arrays;

public class DoubleItem {
  public static void main(String[] args) {
  int[] numList = {3,4,5,6};
  int[] numList2 = new int[numList.length];
  for(int i = 0; i < numList.length; i++){
    numList2[i] = numList[i] * 2;
  }
    System.out.println(Arrays.toString(numList2));

  }
}
