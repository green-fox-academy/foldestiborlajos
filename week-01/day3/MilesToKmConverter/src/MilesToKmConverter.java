import java.util.Scanner;


public class MilesToKmConverter {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
        System.out.println("Mile:");
        int UserInput = scanner.nextInt();

        System.out.println( UserInput * 1.69034 );


    }
}
