import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println( "Give me a number, and I gonna ask you, that many times!" );
        int in = scanner.nextInt();
        int k = 0;
        int j= 0;
        while (k < in) {
            System.out.println("Give me a number:");
            int scan = scanner.nextInt();
            j =+ scan;
            k++;
        }
        System.out.println("Sum:" + j);
        int f = j/in;
        System.out.println("Average:" + f);










    }
}
