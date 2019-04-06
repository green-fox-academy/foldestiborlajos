import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, give me a number");

        int g = scanner.nextInt();

        {for (int i = 0; i < g; i++)
            {for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
                System.out.println("*");
            }
        }

    }
}