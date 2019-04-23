public class Person {
  protected String name;
  protected int age;
  protected String gender;

  public Person(){
    name = "Jane Doe";
    age = 30;
    gender = "female";
  }

  public Person (String name, int age, String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }


  public void introduce() {
    System.out.print("Hi, I am " + getName() + ", a " + getAge() + " old " + getGender());
  }

  public void getGoal() {
    System.out.println("My goal is to live for the moment");
  }

  public void setName (String name){
    this.name = name;
   }

  public void setAge(int age) {
    this.age = age;
  }


  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  public String getGender(){
    return gender;
  }
}



