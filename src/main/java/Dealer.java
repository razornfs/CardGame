import java.util.List;

public class Dealer {
    private Table table;
    private Deck pokerDeck;

    public Dealer(Table table, Deck pokerDeck) {
        this.table = table;
        this.pokerDeck = pokerDeck;
        pokerDeck.shuffle();
    }

    public void giveCards(int amount) {
        List<Player> players = table.getPlayers();
        for (int i = 0; i < amount; i++) {
            for (Player player : players) {
                player.giveCard(pokerDeck.getTopCard());
            }
        }
    }
}
