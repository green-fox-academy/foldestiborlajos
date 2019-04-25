import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestCountLetters {
  CountLetters letters;
  HashMap<Character, Integer> resTest;

  CountLetters letters2;
  HashMap<Character, Integer> resTest2;

  @Before
  public void getLetters() {
    letters = new CountLetters("Hello");
    resTest = new HashMap<>();
    resTest.put('H', 1);
    resTest.put('e', 1);
    resTest.put('l', 2);
    resTest.put('o', 1);
  }

  @Before
  public void getLetter(){
      letters2 = new CountLetters("llllLLLL");
      resTest2 = new HashMap<>();
      resTest2.put('L', 4);
      resTest2.put('l', 4);
  }

  @Test
   public void testCountLettersMethPos(){
    assertEquals(resTest, letters.countLettersMeth());
    assertEquals(resTest2, letters2.countLettersMeth());
  }

  @Test
  public void testCountLettersMethNeg(){
    assertNotEquals(resTest2, letters.countLettersMeth());
  }

}
