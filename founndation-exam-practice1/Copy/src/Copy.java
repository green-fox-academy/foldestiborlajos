import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Copy {

  public static void main(String[] args) {
  }

  public static void copy() {
    System.out.println("copy [source][destination]");
  }

  public static void copy(String source) {
    System.out.println("No destinations is provided");
  }

  public static void copy(String source, String destination) {
    Path sourcePath = Paths.get(source);
    Path destinationPaths = Paths.get(destination);
    List<String> parsedSource = new ArrayList<>();

    try {
      parsedSource = Files.readAllLines(Paths.get(source));

    } catch (IOException e) {
      e.printStackTrace();
    }
    try {
      Files.write(destinationPaths, parsedSource);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
