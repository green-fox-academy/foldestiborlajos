public class Card {
  protected String color;
  protected String value;

  public Card (String color, String value){
    this.color = color;
    this.value = value;
  }

  public String cardToString(){
    return value + " " + color;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }





}
