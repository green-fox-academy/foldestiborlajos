public class main {

  public static void main(String[] args) {



    Deck example = new Deck (36);
    example.shuffle();
    example.shuffle();
    example.shuffle();

    Card[] hand = new Card[4];
    for(Card card: hand){
      card = example.draw();
      System.out.println(card.cardToString());
    }


  }
}
