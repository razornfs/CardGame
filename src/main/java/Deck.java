import java.util.List;

public interface Deck {
    void shuffle();

    Card getTopCard();

    List<Card> getTopCards(int n);
}
