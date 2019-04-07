import java.util.Scanner;

public class DrawADiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number" );
        int a = scanner.nextInt();
        int b = 0;

        for (int j = 0; j < a-1; j++) {
            System.out.print(" t ");
        }

        do { System.out.println( " l ");
            b++;

        {for (int di = 0; di < a-1; di++)


        {if (di == 0 ) {
                        System.out.print(" % ");
                    }
                    else if (b == di) {
                        System.out.print(" d ");
                    }
                    else {
                       System.out.print("   ");
                    }


                }
            }

        }while (b < a-2);

        System.out.println(" l ");

        for( int bot = 0; bot < a; bot++ )
        {
            System.out.print(" b ");
        }


    }
}
