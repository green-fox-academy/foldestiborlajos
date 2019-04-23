public class Tree extends Plant{
  public Tree (String color){
    super(color);
  }

  public boolean needsWater () {
    if (getWater() < 10) {
      System.out.println("The " + getColor() + " needs water.");
      return true;
    } else {
      System.out.println("The " + getColor() + " doesn't needs water");
      return false;
    }
  }

  public void addWater(int amountOfPouredWater){
    this.water += (amountOfPouredWater/10 * 4);
  }
}
