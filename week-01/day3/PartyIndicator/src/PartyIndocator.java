import java.util.Scanner;

public class PartyIndocator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Hi! How was the party? How many boys were there?" );
        int numBoy = scanner.nextInt ();

        System.out.println("Nice! And what about the girls? ");
        int numGirl = scanner.nextInt ();

        if ((numGirl + numBoy >= 20) && ((numBoy > numGirl))){
            System.out.println( "The party must have been excellent!");}


         else if (numGirl <= 0 ) {
                System.out.println("Maan! That must have been a Sausage Party!");}

                else if ((numGirl + numBoy >= 20) && ((numBoy > numGirl)||(numBoy < numGirl))) {
                       System.out.println(" Than it was a quite a good party.");}

                else if (numGirl + numBoy < 20 ) {
            System.out.println("It was just an average party.");}




    }
}
