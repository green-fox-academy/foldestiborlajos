import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class TestOdAvg {

  ArrayList<Integer> testList = new ArrayList<>();
  ArrayList<Integer> testList2 = new ArrayList<>();

  @Before
  public void getList() {
    int[] testNumbers = {1, 4, 5, 11, 67, 89, 100};
    for (int i : testNumbers) {
      this.testList.add(i);
    }
  }

  @Before
  public void getListMaxMin() {
    testList2 = new ArrayList<>();
    testList2.add(Integer.MAX_VALUE);
    testList2.add(3);
    testList2.add(4);
  }

  @Test
  public void testOdAvgPositive() {
    assertEquals(34, OdAvg.odAvg(testList));
  }

  @Test
  public void testOdAvgNegative() {
    assertNotEquals(33, OdAvg.odAvg(testList));
  }

  @Test
  public void testOdAvgLimitCase() {
    assertEquals((2147483647 + 3) / 2, OdAvg.odAvg(testList2));
  }
}
