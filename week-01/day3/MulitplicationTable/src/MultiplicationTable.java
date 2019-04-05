import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Give me a number! :");
        int n = scanner.nextInt();
        for ( int m=0; m <= 10; m++ ){
            System.out.println(m * n);
        }


    }
}
