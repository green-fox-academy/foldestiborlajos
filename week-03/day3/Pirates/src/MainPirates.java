public class MainPirates {
  public static void main(String[] args) {
    Pirate drake = new Pirate(10);
    Pirate sparrow = new Pirate();

    drake.drinkSomeRum();
    System.out.println(drake.stateOfPirate);

    drake.howIsItGoingMate();
    drake.drinkSomeRum();
    drake.drinkSomeRum();
    drake.drinkSomeRum();
    drake.drinkSomeRum();
    System.out.println(drake.stateOfPirate);
    drake.howIsItGoingMate();

    sparrow.die();
    System.out.println(sparrow.stateOfPirate);

    Pirate sparrowGhost = new Pirate();
    drake.brawl(sparrowGhost);
    drake.isDead();
    sparrowGhost.isDead();






  }
}
