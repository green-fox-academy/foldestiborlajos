import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {

        int[] arr = {41, 33, 133, 50,60};
         subint(3, arr);
    }

    public static void subint(int a, int[] array) {

        int [] dec = new int[array.length];
          int[] returnArray = new int[array.length];

           for (int i = 0; i < array.length; i++) {
            dec[i] = array[i];
              int k = dec[i];
                if (k != a);
                  do { k %= 10;
                    if (k == a) {
                      returnArray[i] = i;
                    }
                  }while (k < 0) ;
                }

           System.out.println(Arrays.toString(returnArray));
        }
    }






