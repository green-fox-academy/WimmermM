import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

    Apples test = new Apples();

    @Test
    public void getApple() {
        assertEquals("apple",test.getApple());

    }

}