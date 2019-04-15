import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class JosephiusProblem {
    public static void main(String[] args) {

        System.out.println(josephius(246));

    }

    public static int josephius(int a) {
        List<Integer> joseph = new ArrayList<>(a);

        for (int n = 0; n < a; n++) {
            joseph.add(n, n);
        }
        int stab = 0;
        do{ for (int m = 0; m < joseph.size()-1; m += 1) {

            joseph.remove(m + 1);
            stab++;}

            if ( stab == 1 || stab % 2 == 0) {
                joseph.remove(0);}
            stab = 0;

        }while (joseph.size()>1);
        return joseph.get(0);

    }
}











