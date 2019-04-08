public class Matrix {
    public static void main(String[] args) {
        int[][] j = new int[4][4];


        for (int a = 0; a < j.length; a++)

        {System.out.println("\n");
            for (int b = 0; b < j.length; b++) {
                if (j[a] == j[b]) {

                    System.out.print(" " + 1 + " ");
                } else {
                    System.out.print(" " + 0 + " ");
                }




            }

        }



    }
}
