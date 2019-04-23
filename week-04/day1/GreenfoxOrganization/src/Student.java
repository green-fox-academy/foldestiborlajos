public class Student extends Person{
  protected String previousOrganization;
  protected int skippedDays;

  public Student ( String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student() {
    super();
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public void setPreviousOrganization(String previousOrganization){
    this.previousOrganization = previousOrganization;
  }

  public void setSkippedDays(int skippedDays) {
    this.skippedDays = skippedDays;
  }

  public String getPreviousOrganization() {
    return previousOrganization;
  }

  public int getSkippedDays() {
    return skippedDays;
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a" + age + "year old " + gender + ", who skipped " +
            skippedDays + "already");
  }

  public int skipDays(int numberOfDays) {
    return this.getSkippedDays() + numberOfDays;
  }
}

