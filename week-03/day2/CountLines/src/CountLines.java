import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {

    System.out.println(countLines("papapapapapap"));
    System.out.println(countLines("src/CountLines.java"));
    System.out.println(countLines(( "src/valalmi.txt")));

  }

  public static int countLines( String  fileName) {
    Path inputName = Paths.get(fileName);

    try {
      List<String> parsed = Files.readAllLines(inputName);
      int numberOfLine = 0;
      for(String num : parsed){
        numberOfLine++;
      }
      return numberOfLine;
    } catch(IOException e) {
      return 0;
    }
  }
}
