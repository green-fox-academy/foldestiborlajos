import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Give me a number! ");
        int first = scanner.nextInt();
        System.out.println( "Please give me an other other one!");
        int second = scanner.nextInt();

        if (second > first) {for(int m = first; m<=second; m++){
            System.out.println(m);}}

        else if ( first >= second ) {
            System.out.println ("The second should be bigger than the first. Give an another one that is bigger than the first" );}


        int third = scanner.nextInt();

        if (third > first) {for(int m = first; m<=third; m++){
            System.out.println(m);}}
        else if
            (third < first) {System.out.println ("You should have given a bigger one. Sorry!");}















    }
}
