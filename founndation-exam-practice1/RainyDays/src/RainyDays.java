import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RainyDays {

  public static void main(String[] args) {
    String path= "C:\\Users\\Thinkpad\\foldestiborlajos\\greenfox\\foldestiborlajos\\founndation-exam-practice1\\RainyDays\\cities.csv";
    System.out.println(rainyDays(path));


  }

  public static String rainyDays(String filename) {
    Path inputFile = Paths.get(filename);
    ArrayList<String[]> resultList = new ArrayList<>();
    try {
      List<String> parsedFile = Files.readAllLines(inputFile);

      for (String str : parsedFile) {
        String[] cutLine = str.split(",");
        resultList.add(cutLine);
        System.out.println("");
        for (String part : cutLine) {
          System.out.print(part + " ");
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    ArrayList<String> counterList = new ArrayList<>();

    for (int i = 0; i < resultList.size(); i++) {
      if (resultList.get(i)[2].equals("RAINY")) {
        counterList.add(resultList.get(i)[1]);
      }
    }
    System.out.println( " ");
    System.out.println(counterList.toString());


    String result = "";
    int resultNumber = 0;
    for (String cities : counterList) {
      int locCounter = 0;
      for (String cityName : counterList) {
        if (cities.equals(cityName)) {
          locCounter++;
        }
      }
      if (resultNumber < locCounter) {
        resultNumber = locCounter;
        result = cities;
        System.out.println(cities + resultNumber);

      }
    }
    return result;
  }

}
