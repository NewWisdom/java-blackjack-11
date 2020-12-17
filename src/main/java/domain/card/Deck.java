package domain.card;

import java.util.Collections;
import java.util.List;

public class Deck {
    private static List<Card> deck;

    public static List<Card> deck(){
        return Collections.unmodifiableList(deck);
    }

    public static void makeDeck(List<Card> cards){
        deck = cards;
    }

    public static void shuffleDeck(){
        Collections.shuffle(deck);
    }

    public static Card getTopCardFromDeck(){
        return deck.get(0);
    }
}
