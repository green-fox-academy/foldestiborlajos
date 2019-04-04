import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number!: ");
        int inPut = scanner.nextInt();

        if (inPut <= 0) {
            System.out.println( "Not enough!");}
          else if (inPut == 1){
            System.out.println("One");}
            else if (inPut == 2) {
                System.out.println( "Two");}
                else {
                    System.out.println("A lot ! ");}

    }
}
