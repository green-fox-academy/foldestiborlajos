
import java.util.Arrays;
import java.util.HashMap;

public class Scores {
  private HashMap<Integer, String> scoreMap = new HashMap<Integer, String>() {
  };

  public Scores(){
    scoreMap.put(0,"love");
    scoreMap.put(1,"fifteen");
    scoreMap.put(2,"thirty");
    scoreMap.put(0,"forty");
  }

  public String getPlainScore(int inputScore){
    return this.scoreMap.get(inputScore);
  }
}
