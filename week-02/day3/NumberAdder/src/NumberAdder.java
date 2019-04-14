public class NumberAdder {
    public static void main(String[] args) {
        System.out.println(numberAdd(7));
    }

    public static int numberAdd (int n) {

        if (n <= 1) {
            return 1;
        } else {
         return n += numberAdd(n - 1);


        }



    }
}
