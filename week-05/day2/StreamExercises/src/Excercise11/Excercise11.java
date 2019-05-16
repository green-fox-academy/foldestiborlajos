package Excercise11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Excercise11 {

  public static void main(String[] args) {
    Path inputFile = Paths.get(
        "C:\\Users\\Thinkpad\\foldestiborlajos\\greenfox\\foldestiborlajos\\week-05\\day2\\StreamExercises\\src\\Excercise11\\wikipedia.txt");

    List<String> parsedFile = new ArrayList<>();
    try {
      parsedFile = Files.readAllLines(inputFile);
    } catch (IOException e) {
      e.printStackTrace();
    }

    List<String> wholeString = parsedFile.stream()
        .collect(Collectors.toList());
    String bigSentence = wholeString.toString();
    bigSentence = bigSentence.replace(",", "");
    bigSentence = bigSentence.replace("(", "");
    bigSentence = bigSentence.replace(")", "");
    bigSentence = bigSentence.replace(".", "");
    bigSentence = bigSentence.toLowerCase();

    List<String> wordList = Arrays.asList(bigSentence
        .split(" "));

    Map<String, List<String>> groupedWords= wordList.stream()
        .filter(word -> word != " ")
        .filter(word -> word != "")
        .collect(Collectors.groupingBy(word -> {
              String match = new String();
              for (String w : wordList) {
                if (w.equals((word))) {
                  match = (String) word;
                }
              }
              return match;
            }
            )
        );

    System.out.println(groupedWords);

  }
}

