public class Tree extends Plant{
  public Tree (String color){
    super(color);
  }

  @Override
  public void needsWater() {
    if (getWater() < 10) {
      System.out.println("The " + getColor() + " needs water.");
    } else {
      System.out.println("The " + getColor() + " doesn't needs water");
    }
  }
  @Override
  public boolean needsWaterBoolean() {
    if (getWater() < 10) {
      return true;
    } else {
      return false;
    }
  }

  public void addWater(int amountOfPouredWater){
    this.water += (amountOfPouredWater/10 * 4);
  }
}
