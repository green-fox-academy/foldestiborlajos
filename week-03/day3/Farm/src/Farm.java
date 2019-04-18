import java.util.ArrayList;
import java.util.List;

public class Farm {
  int numberOfPlaces;
  List<Animal> barn = new ArrayList<>();

  public Farm (List<Animal> barn, int numberOfPlaces){
    this.barn = barn;
    this.numberOfPlaces = numberOfPlaces;
  }

  public void breed() {
    if (numberOfPlaces > barn.size()) {
        Animal animalToken = new Animal();
        barn.add(animalToken);
    } else {
      System.out.println("Sorry we are full!");
    }
  }

  public void slaughter(){
    for (int i = 0; i < barn.size(); i++){
       if (barn.get(i).hunger > barn.get(0).hunger){
         barn.add(0, barn.get(i));
         barn.remove(barn.get(i));
       }
    }
    barn.remove(0);
  }
}
