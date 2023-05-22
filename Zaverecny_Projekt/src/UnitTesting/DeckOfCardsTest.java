package UnitTesting;

import cardLogic.Cards;
import cardLogic.DeckOfCards;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DeckOfCardsTest {


    /**
     * testing method that shuffles the cards
     */
    @Test
    void shufflingPlayerCards() {

        DeckOfCards cards = new DeckOfCards(); //creating instance

        int startCount = cards.getPlayerCount(); //count before shuffle

        Cards card = cards.ShufflingPlayerCards(); //assingns cards

        int endCount = cards.getPlayerCount(); //count after shuffle

        assertEquals(startCount + card.getValue(), endCount); //startCount + value of the cards is equal to the endCount

    }

    /**
     * testing method that shuffles the cards
     */
    @Test
    void shufflingDealerCards() {

        DeckOfCards cards = new DeckOfCards();

        int startCount = cards.getDealerCount();

        Cards card = cards.ShufflingDealerCards();

        int endCount = cards.getDealerCount();

        assertEquals(startCount + card.getValue(), endCount);

    }
}