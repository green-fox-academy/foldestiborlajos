public class Station {

   int gasAmount;

  public Station (int gasAmount){
    this.gasAmount = gasAmount;
  }
  public static void refill(Car car, Station station){
    for (int i = car.gasAmount; i < car.capacity; i++){
      car.gasAmount++;
      station.gasAmount --;
    }

  }
}
