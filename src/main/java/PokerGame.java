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
        Dealer dealer = new Dealer(players, deck);
        dealer.giveCards(2);
        while (true) {
            for (Player player : players) {
                //reszta implementacji
            }
        }
    }
}
