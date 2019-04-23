public class Mentor extends Person {
  protected String level;

  Mentor() {
    super();
    this.level = "intermediate";
  }

  Mentor (String name, int age, String gender, String level) {
    super (name, age, gender);
    this.level = "intermediate";
  }

  public void getGoal(){
    System.out.println("Educate Brilliant software developers.");
  }

  public void introduce() {
    super.introduce();
    System.out.print(" " + getLevel());

  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }
}
