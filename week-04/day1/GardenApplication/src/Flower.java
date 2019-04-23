public class Flower extends Plant{

  public Flower (String color){
    super(color);
  }

  @Override
  public void needsWater() {
    if (getWater() < 5) {
      System.out.println("The " + getColor() + " needs water.");
    } else {
      System.out.println("The " + getColor() + " doesn't needs water");
    }
  }
  @Override
  public boolean needsWaterBoolean() {
    if (getWater() < 5) {
      return true;
    } else {
      return false;
    }
  }

  public void addWater(int amountOfPouredWater){
    this.water += ((amountOfPouredWater/4 * 3));
  }


}
