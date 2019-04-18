public class Animal {
  int hunger = 50;
  int thirst = 50;

  public Animal(){
  }
  public Animal(int hunger, int thrist){
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public void eat(){
    hunger --;

  }
  public void drink(){
    thirst --;
    System.out.println(thirst);
  }
  public void play(){
    hunger ++;
    thirst ++;
    System.out.println("hunger:" + hunger);
    System.out.println("thirst" + thirst);
  }
}
