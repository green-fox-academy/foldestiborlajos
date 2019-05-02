import java.util.ArrayList;
import java.util.List;

public class Seconds {

  public static void main(String[] args) {
    List<Integer> testList = new ArrayList();
    for (int i = 1; i < 30; i++) {
      testList.add(i);
    }
    System.out.println(everySecond(testList).toString());
  }

  public static List<Object> everySecond(List inputList) {
    List resultList = new ArrayList();
    for (int i = 1; i < inputList.size(); i += 2) {
      resultList.add(inputList.get(i));
    }
    return resultList;
  }
}
