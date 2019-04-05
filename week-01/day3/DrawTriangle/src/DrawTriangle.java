import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println( "Please, give me a number" );
        int a = scanner.nextInt();
        int b = 0;
        int c = 0;


        do {System.out.println("*"); b += 1;
            do {c++; System.out.print("*");} while (c < b);
            {b += 1;}
            } while (a > b);



















    }
}
