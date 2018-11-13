import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PokerHandTest {

    PokerHand myHand = new PokerHand();
    List<String> myList = new ArrayList<>();
    String string;
    Card card = new Card("A", "H");

    @Test
    public void winner() {

        assertEquals(myHand.winner(myList),"white"); {

        }
    }

    @Test
    public void winne() {
        assertEquals(myHand.winner(myList), "white");
    }


    @Test
    public void cardValue() {

            assertEquals(myHand.cardValue(string), 0);
        }

    @Test
    public void cardSum() {
        assertEquals(myHand.cardSum((ArrayList) myList),6);
    }

    @Test
    public void rank() {
        assertEquals(card.rank(), 14);
    }
}
