import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> ship = new ArrayList<>();
  Pirate captain = new Pirate();
  int calculatedScore;

  public Ship() {
  }

  public Ship (List<Pirate> ship, Pirate captain){
    this.captain = captain;
    this.ship = ship;
  }

  public void fillShip(){
    this.captain = new Pirate();
    int rand = (int) ((Math.random()*70) +1);
    for (int i = 0; i < rand ; i++) {
      Pirate pirateToken = new Pirate();
      ship.add(pirateToken);
    }
  }
  public void stateOfShip(){
    System.out.println(captain.stateOfPirate);
    System.out.println(ship.size());
  }
  public boolean battle(Ship othership) {
    boolean whoWins = false;

    this.calculatedScore = this.ship.size() - this.captain.numberOfDrinks;
    othership.calculatedScore = othership.ship.size()- othership.captain.numberOfDrinks;

    if (this.calculatedScore > othership.calculatedScore) {

      int rand = (int) ((Math.random() * othership.ship.size()) );

      for (int i = 1; i < rand ; i++ ) {
          othership.ship.remove(0);
        }

      int rand1 = (int)((Math.random()*20) +1);

      for (int i = 1; i < rand1; i++ ) {
        if(this.captain.stateOfPirate >= 3) {
          this.captain.drinkSomeRum();
        } else {
          int k = (int) ((Math.random() * ship.size()));
          ship.get(k).drinkSomeRum();
        }
    }
      System.out.println( "Yours has won!");
      whoWins = true;
  }else {
      int rand = (int) ((Math.random() * ship.size()) );

      for (int i = 1; i < rand ; i++) {
          this.ship.remove(0);
      }

      int rand1 = (int) ((Math.random() * 20)+1);

      for (int i = 1; i < rand1; i++) {
        if (othership.captain.stateOfPirate >= 3) {
          othership.captain.drinkSomeRum();
        } else {
          int k = (int) ((Math.random() * othership.ship.size()) );
          othership.ship.get(k).drinkSomeRum();
        }
      }
      System.out.println("The other Ship wins");
      whoWins = false;
    }
    return whoWins;
  }
}
