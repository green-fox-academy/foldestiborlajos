import java.util.ArrayList;
import java.util.List;

public class Armada {
  List<Ship> armList = new ArrayList<>();

  public Armada(){
  }

  public Armada(List<Ship> armlist){
    this.armList = armlist;
  }

  public void war(Armada otherArmada){
   do {
     for (int i = 0; i < otherArmada.armList.size() || i < armList.size(); i++) {
       if (armList.get(i).battle(otherArmada.armList.get(i)) == true) {
         otherArmada.armList.remove(i);
       } else {
         armList.remove(i);
       }
     }
   }while (otherArmada.armList.size() == 0 || armList.size() == 0);
    
   }

  }


