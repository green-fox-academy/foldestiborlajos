public class DrawAChessTable {
    public static void main(String[] args) {
        int li = 10;
        int w = 5;

        for (int col = 0; col< li; col += 1)
        {if (col % 2 ==0){

            for (int row = 1; row <= w; row++) {
                System.out.print("% ");
            }
            System.out.println();
            }

            if (col % 2 > 0)
            {for (int row = 1; row <= w; row++) {
                System.out.print(" %");
            }
            System.out.println();






        }
        }
    }
}
