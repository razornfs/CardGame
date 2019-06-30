import java.util.List;

public class PokerGame {
    Table table;
    Deck deck;

    public PokerGame(Table table, Deck deck) {
        this.table = table;
        this.deck = deck;
    }

    public void play() {
        List<Player> players = table.getPlayers();
        deck.shuffle();
        while (true) {
            for (Player player : players) {
                player.giveCard(deck.getTopCard());
            }
            //reszta implementacji
        }
    }
}
