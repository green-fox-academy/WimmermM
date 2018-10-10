import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

    CountLetters test = new CountLetters();
    HashMap<Character,Integer> testHash = new HashMap();

    @Test
    public void countLetters() {
        testHash.put('h',1);
        testHash.put('e',1);
        testHash.put('l',2);
        testHash.put('o',1);

        assertEquals(testHash,test.countLetters("hello"));

    }
}