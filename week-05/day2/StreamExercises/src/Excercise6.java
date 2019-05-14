import java.util.stream.Collectors;

public class Excercise6{

  public static void main(String[] args) {

    String exampleString = "Write a Stream Expression to find the uppercase characters in a string!";
    System.out.println(exampleString.chars()
        .mapToObj(c -> (char) c)
        .filter(n -> n.isUpperCase(n))
        .collect(Collectors.toList()));
  }
}