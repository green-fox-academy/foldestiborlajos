import java.util.ArrayList;
import java.util.List;

public class Farm {
  int numberOfPlaces;
  List<Animal> barn = new ArrayList<>();

  public Farm (ArrayList barn, int numberOfPlaces){
    this.barn = barn;
    this.numberOfPlaces = numberOfPlaces;
  }

  public void breed(Animal animal) {
    if (numberOfPlaces > barn.size()) {
        barn.add(animal);
    } else {
      System.out.println("Sorry we are full!");
    }
  }

  public void slaughter(){
    for (int i = 0; i < barn.size(); i++){
      barn.indexOf().
    }

  }
}
