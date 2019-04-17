public class Counter {
  int number = 0;

  public Counter(){

  }
  public Counter(int number){
    this.number = number;

  }

  public int add(int inputNumber){
     return number + inputNumber;
  }
  public int add(){
    return number ++;
  }
  public int get(){
    return number;
  }
  public int reset(){
    number = 0;
    return number;
  }

}
