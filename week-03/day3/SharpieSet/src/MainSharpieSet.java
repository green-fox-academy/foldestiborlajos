import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class MainSharpieSet {
  public static void main(String[] args) {
    SharpieSet sharpies = new SharpieSet();

    Sharpie2 one = new Sharpie2("blue", 10.2F);
    Sharpie2 two = new Sharpie2("green", 9.9F);

    two.inkAmount = 0;

    sharpies.addSharpie2(one);
    sharpies.addSharpie2(two);

    try {
      sharpies.countUsable();
      sharpies.removeTrash();
    } catch (ConcurrentModificationException e){
      e.printStackTrace();


  }






  }
}
