public class Plant {
  protected String color;
  protected int water;



  public Plant (String color){
    this.color = color;
    this.water = 0;
  }

  public boolean needsWater() {
    if ( getWater() < 5){
      System.out.println( "The " + getColor() + " needs water.");
      return true;
    }else {
      System.out.println( "The " + getColor() + " doesn't needs water");
      return false;
    }
  }

  public void addWater(int amountOfPouredWater){
     this.water += amountOfPouredWater;
  }

  public int getWater() {
    return water;
  }

  public void setWater(int water) {
    this.water = water;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
