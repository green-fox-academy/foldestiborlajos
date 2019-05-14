import java.util.List;
import java.util.stream.Collectors;

public class Excercise9 {

  public static void main(String[] args) {

    System.out.println(letterFrequency("alabama", 'k'));

  }

  public static long letterFrequency(String inputString, char inputchar){
    return inputString.chars()
        .mapToObj( c -> (char) c)
        .filter(c -> c.equals(inputchar))
        .count();



  }

}
