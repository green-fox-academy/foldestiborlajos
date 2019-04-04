import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println( "Write a number !");
        int inPut = scanner.nextInt();
        if (inPut % 2 == 0) {
            System.out.println("Your number is even");}
            else {
            System.out.println("Your number is odd");}
    }
}
