import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    System.out.println(ipAdresses("src/logs.txt"));
    System.out.println(putGet("src/logs.txt"));
  }

  public static String ipAdresses(String input) {
    Path text = Paths.get(input);

    try {
      List<String> parsedText = Files.readAllLines(text);
      List<String> ipAdd = new ArrayList<>();

      for (String s : parsedText) {
        ipAdd.add(s.substring (27, 39));
      }

      return ipAdd.toString();

    } catch (IOException e) {
      e.printStackTrace();
    }
    return "-1";
  }

  public static String putGet(String input) {
    Path text = Paths.get(input);

    try {
      List<String> parsedText = Files.readAllLines(text);
      int put = 0;
      int get = 0;
      for (String s : parsedText) {
        String p = s.substring(41,42);
        if ( p.equals("P")){
          put ++;
        }else{
          get ++;
        }

      }
       return put + "/" + get;
    } catch (IOException e) {
      e.printStackTrace();
    }
     return "-1";
  }
}

