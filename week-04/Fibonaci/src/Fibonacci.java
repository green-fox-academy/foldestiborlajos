public class Fibonacci {
  int fibIndex;
  int count;
  int m = 1;
  int n = 0;

  public Fibonacci(int fibIndex){
   this.fibIndex = fibIndex;
   count = 0;
  }

  public int getFibonacci(int m, int n){

    count += m - n;

    if(this.fibIndex == 0){
    }else{
      this.fibIndex --;

      getFibonacci(m + n, m);
    }
    return this.count;
  }
}
