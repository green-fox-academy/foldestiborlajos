import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestApples {
  Apples apples;

  @Before
  public void setApples() {
    apples = new Apples();
  }

  @Test
  public void getApplesPositive(){
     assertEquals("apple", apples.getApple());
  }

  @Test
  public void getApplesNegative(){
    assertNotEquals("hello", apples.getApple());
  }
}

