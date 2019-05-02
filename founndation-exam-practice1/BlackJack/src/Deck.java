import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Deck {

  int numberOfCards;
  List<Card> deck;

  String[] valuesOfCards = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King",
      "Ace"};
  String[] colorsOfCards = {"Heart", "Diamond", "Treff", "Spade"};


  public Deck(int numberOfCards) {
    this.numberOfCards = numberOfCards;
    this.deck = new ArrayList<>();
    Card[][] possibiltyMatrix =
        this.createCardPossibiltyMatrix(this.colorsOfCards, this.valuesOfCards);
    int counterOfAdd = numberOfCards;

    do{for (int k = 0; k < valuesOfCards.length; k++) {
      if (deck.size() == numberOfCards) {
        break;
      } else {
        for (int i = 0; i < colorsOfCards.length; i++) {
          Card cardToken = possibiltyMatrix[i][k];
          deck.add(cardToken);
          counterOfAdd --;
          if (deck.size() == numberOfCards) {
            break;
          }
        }
      }
    }
    }while(counterOfAdd > 0);
  }


  public Card[][] createCardPossibiltyMatrix(String[] colorsOfCards, String[] valuesOfCards) {
    Card[][] cardPossibilityMatrix = new Card[colorsOfCards.length][valuesOfCards.length];
    for (int i = 0; i < colorsOfCards.length ; i++) {
      for (int k = 0; k < valuesOfCards.length ; k++) {
        Card cardToken = new Card(colorsOfCards[i], valuesOfCards[k]);
        cardPossibilityMatrix[i][k] = cardToken;
      }
    }
    return cardPossibilityMatrix;
  }

  public List<Card> shuffle(){
    List<Card> shuffledDeck = new ArrayList<>();
    for(int i = this.deck.size(); i != 0; i-- ){
      int randomCard = (int) (Math.random() * this.deck.size()-1);
      shuffledDeck.add(this.deck.get(randomCard));
      this.deck.remove(randomCard);
  }
    this.deck = shuffledDeck;
    return this.deck;
  }

  public Card draw(){
    Card drawn = this.deck.get(this.deck.size()-1);
    this.deck.remove(this.deck.size()-1);
    return drawn;
  }

  public void deckToString(){
    int heart = 0;
    int diamond = 0;
    int treff = 0;
    int spade = 0;

    for (Card cd : deck){
      if (cd.color.equals("Heart")){
        heart ++;
      } else if (cd.color.equals("Diamond")){
        diamond ++;
      } else if (cd.color.equals("Treff")){
        treff++;
      } else {
        spade++;
      }
    }

    System.out.println( deck.size() + " cards " + heart + " Hearts " + diamond + " Diamond " +
        treff + " treff " + spade + " Spade ");
  }


}
