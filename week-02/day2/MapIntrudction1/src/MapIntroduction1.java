import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {
  public static void main(String[] args) {
    HashMap<Integer,Character > intro = new HashMap<>();
    System.out.println(intro.isEmpty());
    intro.put(97, 'a' );
    intro.put(98, 'b');
    intro.put(99, 'c');
    intro.put(65, 'A' );
    intro.put(66, 'B');
    intro.put(67, 'C');

    System.out.println(intro.keySet());
    System.out.println(intro.values());

    intro.put(68, 'D');

    System.out.println(intro.size());
    intro.get(99);
    intro.remove(97);
    System.out.println(intro.containsKey(100));
    intro.clear();
    System.out.println(intro.isEmpty());
  }
}

