public class CompareMatrix {

  public static void main(String[] args) {

    int[][] testMatrix1 = new int[3][3];
    int[][] testMatrix2 = new int[3][3];

    int positionLabel1 = 0;
    int positionLabel2 = 9;

    for (int i = 0; i < testMatrix1.length; i++) {
      System.out.println(" ");
      for (int k = 0; k < testMatrix1.length; k++) {

        testMatrix1[i][k] = positionLabel1;
        positionLabel1++;
        testMatrix2[i][k] = positionLabel2;
        positionLabel2--;
        System.out.println(positionLabel1 + " " + positionLabel2);

      }
    }

    compareMatrix(testMatrix1, testMatrix2);
  }

  public static int[][] compareMatrix(int[][] matrix1, int[][] matrix2) {
    int[][] resultMatrix = new int[matrix1.length][matrix1.length];

    for (int i = 0; i < matrix1.length; i++) {
      System.out.println(" ");
      for (int k = 0; k < matrix2.length; k++) {
        if (matrix1[i][k] < matrix2[i][k]) {
          resultMatrix[i][k] = matrix2[i][k];
          System.out.print(resultMatrix[i][k]);
        } else {
          resultMatrix[i][k] = matrix1[i][k];
          System.out.print(resultMatrix[i][k]);
        }
      }
    }
    return resultMatrix;
  }
}
