import java.util.ArrayList;
import java.util.List;

public class MainFarm {

  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<>();
      Farm uncleFarm = new Farm(animals, 10);
      Animal tyuk = new Animal(25,30);
      Animal tyuk2 = new Animal (40,30);
      Animal tyuk3 =new Animal (10,10);
      uncleFarm.breed();
      animals.add(tyuk);
      animals.add(tyuk2);
      animals.add(tyuk3);
      for(int i = 0; i < uncleFarm.numberOfPlaces; i++ ){
        uncleFarm.breed(); }
      for ( Animal an : animals ){
        an.hunger = 20;
      }
      animals.get(7).hunger = 49;

      uncleFarm.slaughter();

}
}
