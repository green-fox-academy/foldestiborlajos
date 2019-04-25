
import org.junit.Before;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class TestSum {
  Sum sumTest = new Sum();
  Sum sumTest2 = new Sum();
  Sum sumTest3 = new Sum();
  Sum sumTest4 = new Sum();

  @Before
  public void getSum(){
    sumTest.sumList.add(3);
    sumTest.sumList.add(5);
    sumTest.sumList.add(7);
    sumTest.sumList.add(14);
    sumTest.sumList.add(0);
  }

  @Before
  public void getSum2(){
    sumTest2.sumList.add(1);
  }
  @Before
  public void getNull(){
    sumTest4.sumList.add(null);
  }

  @Test
  public void sumTestPositive(){
    assertEquals(29,sumTest.sum());
    assertEquals(1, sumTest2.sum());
  }
  @Test
  public void sumTestNegative(){
    assertNotEquals(30, sumTest.sum());
    assertNotEquals(34, sumTest2.sum());
  }
  @Test
  public void setSumTestEmptyPositive(){
    assertEquals(0,sumTest3.sum());
  }
  @Test
  public void setSumTestEmptyNegative(){
    assertNotNull(sumTest2.sum());
  }
  @Test(expected = NullPointerException.class)
  public void setSumTestNull(){
   assertNull(sumTest4.sum());
  }
  @Test
  public void setSumTestNull2(){
    assertEquals(null, sumTest.sum());
  }


}
