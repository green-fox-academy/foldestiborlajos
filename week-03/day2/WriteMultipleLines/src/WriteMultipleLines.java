import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {
     Path multiple = Paths.get("src/multiple");
      multipleLines("src/multiple", "apple&soda", 78);


  }
  public static void multipleLines(String path, String word, int number){
    Path dest = Paths.get(path);
    List<String> inputWord = new ArrayList<>();
    for(int i = 0; i < number; i++) {
      inputWord.add(word);
    }
    try {

        Files.write(dest, inputWord);

    } catch(IOException e) {
      System.out.println("Unable to write.");
    }

  }
}
