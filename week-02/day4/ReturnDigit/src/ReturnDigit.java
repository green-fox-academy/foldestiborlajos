

public class ReturnDigit {

      public static void main(String[] args) {

        returnDigits(9345681, 0);
      }

      public static void returnDigits(int dig, int b) {
        int l = dig % 10;
        b += l;

        if (dig <= 0) {
            System.out.println(b);
        } else {
            returnDigits((dig / 10 ), b);
        }

    }
}
