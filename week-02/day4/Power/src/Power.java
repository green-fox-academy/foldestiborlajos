public class Power {
    public static void main(String[] args) {
        System.out.println(power(10,4));
    }
    public static int power(int base, int pow) {
        int n = 1;
        if ( n == pow){
          return base;
        } else {
            n++;
            return power(base*=base,pow -1);
        }
    }
}
