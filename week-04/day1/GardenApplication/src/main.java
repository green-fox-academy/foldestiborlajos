public class main {
  public static void main(String[] args) {


    Flower flower1 = new Flower("yellow");
    Flower flower2 = new Flower("blue");

    Tree tree1 = new Tree ("purple");
    Tree tree2 = new Tree ("orange");

    Garden garden1 = new Garden();

    garden1.addPlant(flower1);
    garden1.addPlant(flower2);
    garden1.addPlant(tree1);
    garden1.addPlant(tree2);

    garden1.watering(40);
    garden1.watering(70);

  }
}