

import java.util.HashMap;


public class CountLetters {
  String letters;
  public CountLetters(String letters){
    this.letters = letters;
  }

  public HashMap<Character, Integer> countLettersMeth(){
    HashMap<Character, Integer> resultMap = new HashMap<>();
    char[] charArray = this.letters.toCharArray();
    for(int i = 0; i < this.letters.length(); i++){
      char ch = charArray[i];

      if (resultMap.containsKey(ch)){
        int track = resultMap.get(ch);
        resultMap.replace(ch, track +=1 );
      }else{ resultMap.put(ch, 1);
    }
  }
    return resultMap;
 }
}
