import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {


    Sum mySum = new Sum();
    List myList = new ArrayList();


    @Test
    public void sumMultipleElementsTest() {
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        assertEquals(15, mySum.sum((ArrayList<Integer>) myList));


    }


    @Test
    public void sumEmptyListTest() {
        assertEquals(0, mySum.sum((ArrayList<Integer>) myList));
    }

    @Test
    public void sumOneElementTest() {
        myList.add(8);
        assertEquals(8, mySum.sum((ArrayList<Integer>) myList));

    }

    @Test
    public void sumNullTest() {
        assertEquals(0, mySum.sum(null));
    }
}