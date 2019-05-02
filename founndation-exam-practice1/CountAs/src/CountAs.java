
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CountAs {

  public static void main(String[] args) {
    System.out.println(countA(
        "C:\\Users\\Thinkpad\\foldestiborlajos\\greenfox\\foldestiborlajos\\founndation-exam-practice1\\CountAs\\src\\test.txt"));
  }

  public static int countA(String fileName) {
    int counterOfAs = 0;
    try {
      List<String> parsedFile = Files.readAllLines(Paths.get(fileName));
      for (String str : parsedFile) {
        str.toLowerCase();
        for (char c : str.toCharArray()) {
          if (c == 'a') {
            counterOfAs++;
          }
        }
      }
    } catch (IOException e) {
      return 0;
    }
    return counterOfAs;
  }
}
