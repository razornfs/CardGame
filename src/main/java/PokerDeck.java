import java.util.List;

public class PokerDeck implements Deck {
    List<Card> cards;

    public PokerDeck(List<Card> cards) {
        this.cards = cards;
    }

    public void shuffle() {
        // implementacja
    }

    public Card getTopCard() {
        // implementacja
        return null;
    }

    public List<Card> getTopCards(int n) {
        return null;
    }
}
