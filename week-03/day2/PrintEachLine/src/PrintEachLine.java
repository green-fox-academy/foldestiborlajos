import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    Path myFile = Paths.get("assets/my-file.txt");

   try {
     List<String> myFileParsed = Files.readAllLines(myFile);
   } catch (IOException e){
     System.out.println("Unable to read the file");
   }
  }
}
