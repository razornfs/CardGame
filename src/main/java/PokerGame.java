import java.util.List;

public class PokerGame {
    Table table;
    Deck pokerDeck;

    public PokerGame(Table table, Deck pokerDeck) {
        this.table = table;
        this.pokerDeck = pokerDeck;
    }

    public void play() {
        List<Player> players = table.getPlayers();
        Dealer dealer = new Dealer(table, pokerDeck);
        dealer.giveCards(2);
        while (true) {
            for (Player player : players) {
                //reszta implementacji
            }
        }
    }
}
