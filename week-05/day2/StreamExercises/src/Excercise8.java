import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Excercise8 {

  public static void main(String[] args) {
    String example = "vak";
    List<Character> exampleChars = Arrays.asList('á','c','i','ó');

    System.out.println(tailingAString(exampleChars,example));

  }

  public static String tailingAString(List<Character> inputCharacters, String givenString){
    String tail = inputCharacters.stream()
        .map(ch -> ch.toString())
        .collect(Collectors.joining());
    return givenString.concat(tail);
  }
}
