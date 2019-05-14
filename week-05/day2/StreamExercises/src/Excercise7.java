import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Excercise7 {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM",
            "ABU DHABI", "PARIS");

    System.out.println(findString("P",cities));

  }

  public static List<String> findString(String input, List<String> cities) {
      return cities.stream()
          .filter(str -> str.startsWith(input))
          .collect(Collectors.toList());
    }
  }
