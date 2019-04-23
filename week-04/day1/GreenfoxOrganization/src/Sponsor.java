public class Sponsor extends Person{
 protected String company;
 protected int hiredStudents;

  public Sponsor (String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }
  public Sponsor(){
    super();
    this.company = "google";
    this.hiredStudents = 0;
  }

  public void introduce() {
    super.introduce();
    System.out.print(" who represents" + this.getCompany() + " and hired" + this.getHiredStudents() + " sofar.");
  }

  public int hire() {
    return this.hiredStudents ++;
  }

  public void getGoal() {
    System.out.println("Hire brilliant sotfware developers.");
  }

  public int getHiredStudents() {
    return hiredStudents;
  }

  public void setHiredStudents(int hiredStudents) {
    this.hiredStudents = hiredStudents;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }
}
