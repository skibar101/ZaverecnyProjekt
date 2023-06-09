package cardLogic;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

/**
 * class where files of cards are loaded into an arraylist and method for shuffling card is here
 */
public class DeckOfCards {

    private ArrayList<Cards> deck = new ArrayList<>(); //arraylist where files and value of the card are stored

    private int playerCount;

    private int dealerCount;

   //region getters, setters and contructor


    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    public ArrayList<Cards> getDeckOfCards() {
        return deck;
    }

    public void setDeckOfCards(ArrayList<Cards> deckOfCards) {
        this.deck = deckOfCards;
    }

    public int getDealerCount() {
        return dealerCount;
    }

    public void setDealerCount(int dealerCount) {
        this.dealerCount = dealerCount;
    }

    //endregion


    /**
     * generating images from files and storing them into an arraylist
     * files of the cards go from 2 to 14
     * each cards has the value so if the index is two value is the same, if the index is bigger than 12 (jack, queen and king) the value is 10
     */
    public DeckOfCards() {

        for (int i = 2; i < 15; i++) {
            if (i < 12) {
                URL s = getClass().getResource("/hearts/" + i + "_of_hearts.png");
                deck.add(new Cards(s, i));
            } else {
                URL s = getClass().getResource("/hearts/" + i + "_of_hearts.png");
                deck.add(new Cards(s, 10));
            }

            for (int j = 2; j < 15; j++) {
                if (i < 12) {
                URL s = DeckOfCards.class.getResource("/spades/" + i + "_of_spades.png");
                deck.add(new Cards(s, i));
            } else {
                URL s = DeckOfCards.class.getResource("/spades/" + i + "_of_spades.png");
                deck.add(new Cards(s, 10));
            }

            }


            for (int k = 2; k < 15; k++) {
                if (i < 12) {
                URL s = DeckOfCards.class.getResource("/clubs/" + i + "_of_clubs.png");
                deck.add(new Cards(s, i));
            } else {
                URL s = DeckOfCards.class.getResource("/clubs/" + i + "_of_clubs.png");
                deck.add(new Cards(s, 10));
            }

            }

            for (int l = 2; l < 15; l++) {
                if (i < 12) {
                URL s = DeckOfCards.class.getResource("/diamonds/" + i + "_of_diamonds.png");
                deck.add(new Cards(s, i));
            } else {
                URL s = DeckOfCards.class.getResource("/diamonds/" + i + "_of_diamonds.png");
                deck.add(new Cards(s, 10));
            }

            }

        }
    }


    /**
     * method for shufling card arraylist that belongs to the player
     */
    public Cards ShufflingPlayerCards() {
        Collections.shuffle(deck); //shuffling arraylist
        Cards card = deck.get(0);  //picking zero index
        playerCount += deck.get(0).getValue(); //assigns value to the picked cards
        return card; //returning a card
    }

    /**
     * method for shufling card arraylist that belongs to the dealer
     */
    public Cards ShufflingDealerCards() {
        Collections.shuffle(deck);
        Cards card = deck.get(0);
        dealerCount += deck.get(0).getValue();
        return card;
    }

}







