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

        DeckOfCards cards = new DeckOfCards(); //creating object

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



    /**
     * testing constructor that reads the files
     */
    @Test
    void deckOfCards(){

        DeckOfCards test = new DeckOfCards();

        ArrayList<Cards> deck = test.getDeckOfCards();

        assertEquals("Zaverecny_Projekt\\src\\karty\\hearts\\2_of_hearts.png", deck.get(0).getFilePath());
        assertEquals(2, deck.get(0).getValue());
        assertEquals("Zaverecny_Projekt\\src\\karty\\spades\\10_of_spades.png", deck.get(9).getFilePath());
        assertEquals(10, deck.get(9).getValue());
        assertEquals("Zaverecny_Projekt\\src\\karty\\clubs\\5_of_clubs.png", deck.get(17).getFilePath());
        assertEquals(5, deck.get(17).getValue());
        assertEquals("Zaverecny_Projekt\\src/karty\\diamonds\\3_of_diamonds.png", deck.get(28).getFilePath());
        assertEquals(3, deck.get(28).getValue());
    }
}