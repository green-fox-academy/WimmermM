import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram test = new Anagram();

    @Test
    public void angram() {
        assertTrue(test.angram("dogec","gode"));
    }
}