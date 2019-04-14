public class Bunnies {
    public static void main(String[] args) {
        System.out.println(bunnies(32));
    }
    public static int bunnies(int n){
        int k = n+1;
        k -= 1;

        if( k == 0) {
           return n;
        } else
             bunnies((n - 1));
              return n+k;












    }
}
