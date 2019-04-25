import java.util.ArrayList;
import java.util.List;

public class Sum {
  List<Integer> sumList;

  public Sum(){
    sumList = new ArrayList<>();
  }



  public int sum(){
    int count = 0;
      for (int i = 0; i < this.sumList.size(); i++){
        count += this.sumList.get(i);
      }
     return count;


  }
}
