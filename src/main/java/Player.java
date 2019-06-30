import java.util.List;

public class Player {
    List<Card> hand;

    public Player(List<Card> hand) {
        this.hand = hand;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void giveCard(Card card) {
        hand.add(card);
    }
}
