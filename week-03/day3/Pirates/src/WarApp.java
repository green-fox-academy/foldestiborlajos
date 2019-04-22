import java.util.ArrayList;
import java.util.List;

public class WarApp {
  public static void main(String[] args) {
    List<Pirate> crewBlackPearl = new ArrayList<>();
    Ship blackpearl = new Ship();
    blackpearl.ship = crewBlackPearl;
    blackpearl.fillShip();

    List<Pirate> crewSzokeTisza = new ArrayList<>();
    Ship szokeTisza = new Ship();
    szokeTisza.ship = crewSzokeTisza;

    Ship ship1 = new Ship();
    Ship ship2 = new Ship();
    Ship ship3 = new Ship();
    Ship ship4 = new Ship();
    Ship ship12 = new Ship();
    Ship ship11 = new Ship();
    Ship ship13 = new Ship();
    Ship ship14 = new Ship();
    Ship ship15 = new Ship();

   ship1.fillShip();
   ship2.fillShip();
   ship3.fillShip();
   ship4.fillShip();
   ship11.fillShip();
   ship12.fillShip();
   ship13.fillShip();
   ship14.fillShip();
   ship15.fillShip();

    Armada armada1 = new Armada();
    Armada armada2 = new Armada();

   Ship[] armadaArr1 = {blackpearl, ship1, ship2, ship3, ship4};
   Ship[] armadaArr2 = {szokeTisza, ship11, ship12, ship13, ship14, ship15};

   for(int i = 0; i < armadaArr1.length; i++ ){
     armada1.armList.add(armadaArr1[i]);
   }
   for(int i = 0; i < armadaArr2.length; i++) {
     armada2.armList.add(armadaArr2[i]);
   }
   armada2.war(armada1);
  }

}
