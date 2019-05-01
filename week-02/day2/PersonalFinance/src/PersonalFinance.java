import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

public class PersonalFinance {
    public static void main(String[] args) {
        List<Integer> spend = Arrays.asList(500, 1000, 1250, 175, 800, 120);
         application (spend);
      System.out.println(spend.toString());
    }

    public static void application(List<Integer> arrl) {
        int sum =0;
          for (int i = 0; i < arrl.size(); i++){
            int val = arrl.get (i);
            sum = sum + val;
        }

        int av = sum/ arrl.size();

        int mem;
        int max = 0;

          for ( int i=0; i < arrl.size(); i++) {
            int chk = arrl.get(i);
              mem = chk;
                if (max <= mem){ max +=(mem-max);
                }
                  else {
                   }
          }

          int memo;
          int min = max;
            for (int z=0; z < arrl.size(); z++){
                int chk = arrl.get (z);
                memo = chk;
                if (memo < min ) {min = memo;
                }
                else{
                }

            }

        System.out.println("Min:" + sum);
        System.out.println("Max:" + max);
        System.out.println("Min:" + min );
        System.out.println("Av:" + av);


    }
}