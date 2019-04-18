
import java.io.IOException;

import java.nio.file.*;


public class CopyFile {
  public static void main(String[] args) {

    copy("src/text1.txt","src/text4.txt");
  }
  public static void copy( String origin, String dest  ) {

    Path des = Paths.get(dest);
    Path orig = Paths.get(origin);


    try {
       Files.copy(orig, des, StandardCopyOption.REPLACE_EXISTING);
      } catch (IOException e) {
      e.printStackTrace();
    }
    }


  }
