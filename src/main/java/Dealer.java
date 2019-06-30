import java.util.List;

public class Dealer {
    private List<Player> players;
    private Deck deck;

    public Dealer(List<Player> players, Deck deck) {
        this.players = players;
        this.deck = deck;
        deck.shuffle();
    }

    public void giveCards(int amount) {
        for (int i = 0; i < amount; i++) {
            for (Player player : players) {
                player.giveCard(deck.getTopCard());
            }
        }
    }
}
