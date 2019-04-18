public class Pirate {
  int stateOfPirate = 10;
  String nameOfParrot;
  int numberOfDrinks = 0;

  public Pirate(){
  }

  public Pirate (int stateOfPirate){
    this.stateOfPirate = stateOfPirate;
  }

  public void drinkSomeRum(){
    stateOfPirate --;
    numberOfDrinks++;
  }

  public void howIsItGoingMate(){
    if(numberOfDrinks >= 0 && numberOfDrinks <= 4) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    }
  }
  public void die(){
    for(int i = stateOfPirate; i > 0; i -- ){
      stateOfPirate --;
    }
    System.out.println(" He is dead. Rip");
  }

  public void brawl(Pirate fightBuddy) {

    int fightResult = (int)(Math.random()* 3 + 1);

    if(fightResult == 1) {this.die();
    } else if (fightResult == 2) {
      fightBuddy.die();
    } else {
      System.out.println("They just Passed out.");
    }

    }

    public void isDead(){
      if (stateOfPirate > 0){
        System.out.println("Not yet!");
      } else {
        System.out.println("YEEAH! Long live the Queen!");
      }
    }


  }



