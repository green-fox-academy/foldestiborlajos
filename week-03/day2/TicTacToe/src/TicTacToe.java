import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {
  public static void main(String[] args) {

  }
  public static String ticTacToe(String input){
    Path game = Paths.get(input);
    try {
      List<String> parsedGame = Files.readAllLines(game);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
