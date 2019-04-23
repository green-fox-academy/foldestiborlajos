public class Flower extends Plant{

  public Flower (String color){
    super(color);
  }

  public void addWater(int amountOfPouredWater){
    this.water += ((amountOfPouredWater/4 * 3));
  }


}
