

public class MainPetrolStation {
  public static void main(String[] args) {
    Station omw = new Station(400);
    Car kicsiKocsi = new Car();
    Station.refill(kicsiKocsi, omw);
    System.out.println(kicsiKocsi.gasAmount + " " +  omw.gasAmount);
  }
}
