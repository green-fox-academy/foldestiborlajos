
import java.util.ArrayList;

public class Main {

  public static void main(String... args) {
    ArrayList<Pirate> pirates = new ArrayList<>();

    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));
    woodenAndRich(pirates);

  }

  public static ArrayList<Pirate> woodenAndRich(ArrayList<Pirate> inputList){
    ArrayList<Pirate> resultList = new ArrayList<>();
    for (Pirate p : inputList) {
      if (p.hasWoodenLeg == true && p.gold >= 15){
        resultList.add(p);
        System.out.print(p.name + " ");
      }
    }
    return resultList;
  }
}


