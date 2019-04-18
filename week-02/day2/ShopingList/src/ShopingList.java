import javax.sound.midi.Soundbank;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javax.swing.UIManager.get;

public class ShopingList {
  public static void main(String[] args) {
    HashMap <String, Double> prices = new HashMap<>();
    HashMap <String, Double> bobList = new HashMap<>();
    HashMap <String, Double> aliceList = new HashMap<>();

    String[] key = { "Milk", "Rice", "Egg",  "Cheese", "ChickenBreast", "Apples", "Tomato", "Potato", "Onion"};
    Double[] money = {1.07, 1.59, 3.14, 12.60, 9.40, 2.31, 2.58, 1.75, 1.10 };

    for ( int i = 0; i < key.length; i++){
      prices.put(key[i], money[i]);
    }

    System.out.println(prices.entrySet());

    String[] keyBob = { "Milk", "Rice", "Egg",  "Cheese", "ChickenBreast", "Apples", "Tomato", "Potato"};
    Double[] valueBob = { 3.0, 2.0, 2.0, 1.0, 4.0, 1.0, 2.0, 1.0};

    for ( int i = 0; i < keyBob.length; i++){
      bobList.put(keyBob[i], valueBob[i]);
    }
    System.out.println(bobList);

    String[] keyAlice ={"Rice", "Egg", "ChickenBreast", "Apples", "Tomato"};
    Double[] valueAlice = {1.0, 5.0, 2.0, 1.0, 10.0};

    for (int i = 0; i < keyAlice.length; i++){
       aliceList.put(keyAlice[i], valueAlice[i]);
    }
    System.out.println(aliceList.entrySet());
    
  }
}
