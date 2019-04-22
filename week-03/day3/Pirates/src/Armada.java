import java.util.ArrayList;
import java.util.List;

public class Armada {
  List<Ship> armList;
  public Armada(){
    this.armList = new ArrayList<>();
  }

  public Armada(List<Ship> armlist){
    this.armList = new ArrayList<>();
  }

  public void war(Armada otherArmada){
    do {
      for (int i = 0; i < otherArmada.armList.size() && i < armList.size(); i++) {
        if (armList.get(0).battle(otherArmada.armList.get(0)) == true) {
          otherArmada.armList.remove(0);
        } else {
          armList.remove(0);
        }
      }
    }while ( otherArmada.armList.isEmpty() != true && armList.isEmpty() != true );


    if (armList.isEmpty() == true) {
      System.out.println("Unfortunately, you have lost. :(");
    } else {
      System.out.println("Gongrats! Your navy is the winner");
    }
  }
}


