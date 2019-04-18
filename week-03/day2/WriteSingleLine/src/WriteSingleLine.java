import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {

    writeLine("My Name");
  }

  public static void writeLine (String line){
    Path myText = Paths.get("src/my-text.txt");
    List<String> input = new ArrayList <>(1);
    input.add(line);

    try {
      Files.write(myText,input);
      }catch(IOException e){
        System.out.println( "Unable to write.");
      }
    }
}
