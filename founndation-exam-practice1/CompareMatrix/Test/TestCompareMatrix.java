import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

import org.junit.Before;
import org.junit.Test;

public class TestCompareMatrix {

  CompareMatrix test;
  int[][] testMatrix1;
  int[][] testMatrix2;

  @Before
  public void setupTestCases() {
    test = new CompareMatrix();
    testMatrix1 = new int[3][3];
    testMatrix2 = new int[3][3];

    int positionLabel1 = 0;
    int positionLabel2 = 9;

    for (int i = 0; i < testMatrix1.length; i++) {
      for (int k = 0; k < testMatrix1.length; k++) {
        testMatrix1[i][k] = positionLabel1;
        positionLabel1++;
        testMatrix2[i][k] = positionLabel2;
        positionLabel2--;
        System.out.println(positionLabel1 + " " + positionLabel2);
      }
    }
  }

  @Test
  public void isCompareMatrixChangedBigger() {
    assertEquals(9, CompareMatrix.compareMatrix(testMatrix1, testMatrix2)[0][0]);
    assertEquals(7, CompareMatrix.compareMatrix(testMatrix1, testMatrix2)[0][2]);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void whetherTrowsAnException() {
    testMatrix2[3][3] = 5;
    assertEquals(5, CompareMatrix.compareMatrix(testMatrix1, testMatrix2)[3][3]);
  }

}

