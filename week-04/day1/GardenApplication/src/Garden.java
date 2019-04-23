import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> garden;

  public Garden (){
    this.garden = new ArrayList<>();
  }

  public void addPlant(Plant plant){
    this.garden.add(plant);
  }

  public void whoNeedsWaterToPrint(){
    for (Plant plant : garden) {
      plant.needsWater();
    }
  }

  public int whoNeedsWater(){
    int numberOfDry = 0;
    for (Plant plant : garden) {
      if(plant.needsWaterBoolean()){
        numberOfDry++;
      }
    }
    return numberOfDry;
    }

  public void watering(int amountOfWatering){
    int y = amountOfWatering /= this.whoNeedsWater() ;
    for (Plant plant : garden) {
      if (plant.needsWaterBoolean()) {
        plant.addWater(y);
        plant.needsWater();
      }
      else {plant.needsWater();
      }

    }

  }
}
