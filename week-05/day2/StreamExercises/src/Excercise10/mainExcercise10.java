package Excercise10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mainExcercise10 {

  public static void main(String[] args) {
   List<Fox> exampleFoxList = Arrays.asList(
       new Fox("Vuk", "red", 2),
       new Fox("Karak", "green", 4),
       new Fox("Mr.Fox", "green", 30),
       new Fox("Róka", "green", 3),
       new Fox("Szmöre", "red",13));

    System.out.println(findGreenFoxes(exampleFoxList));
    System.out.println(findGreenAndYoungFoxes(exampleFoxList));
    System.out.println(frequencyOfGreenFoxes(exampleFoxList));
  }

  public static List<String> findGreenFoxes(List<Fox> inputList){
    return inputList.stream()
        .filter(fox -> fox.color.equals("green"))
        .map(fox -> fox.name)
        .collect(Collectors.toList());
  }

  public static List<String> findGreenAndYoungFoxes(List<Fox> inputList){
    return inputList.stream()
        .filter(fox -> fox.color.equals("green") && fox.age < 5)
        .map(fox -> fox.name)
        .collect(Collectors.toList());
  }

  public static float frequencyOfGreenFoxes(List<Fox> inputList){
    return inputList.stream()
        .filter(fox -> fox.color.equals("green"))
        .count();
  }
}
