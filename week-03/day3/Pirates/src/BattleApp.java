import java.util.ArrayList;
import java.util.List;

public class BattleApp {
  public static void main(String[] args) {
      List<Pirate> crewBlackPearl = new ArrayList<>();
      Ship blackpearl = new Ship();

      List<Pirate> crewSzokeTisza = new ArrayList<>();
      Ship szokeTisza = new Ship();

      szokeTisza.ship = crewSzokeTisza;
      blackpearl.ship = crewBlackPearl;

      szokeTisza.fillShip();
      blackpearl.fillShip();

      System.out.println(szokeTisza.battle(blackpearl));
    }
  }


