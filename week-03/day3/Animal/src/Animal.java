public class Animal {
  int hunger = 50;
  int thirst = 50;


  public void eat(){
    hunger --;
    System.out.println(hunger);
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
