import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie2> sharpieList = new ArrayList<>();

  public void countUsable() {
    for (Sharpie2 s : sharpieList) {
      if (s.inkAmount > 0) {
        s.usable = true;
        System.out.println(s.color + " " + s.usable);
      } else {
        s.usable = false;
        System.out.println(s.color + " " + s.usable);
      }
    }
  }

  public void removeTrash() {
    for (int i =0; i < sharpieList.size(); i++) {
      if (sharpieList.get(i).usable == false) {
        sharpieList.remove(sharpieList.get(i));
      }
    }
  }

  public void addSharpie2(Sharpie2 sharpie2name) {
    sharpieList.add(sharpie2name);
  }
}


