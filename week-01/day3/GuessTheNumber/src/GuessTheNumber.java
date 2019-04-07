import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess my number?");
        int stored = 8;

        for (int given = scanner.nextInt(); given != stored; given =scanner.nextInt())
               if (given < stored) {
                   System.out.println("The stored number is higher");
               }
                 else if (given > stored){
                     System.out.println("The stored number is less");
                 }
                  else {
                   }
        System.out.println("That's correct!");







    }
}
