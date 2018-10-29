import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {


    @Test
    public void getIndex(List<Integer> myList, int b) {
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.indexOf(b);

        for (Integer a : myList) {
            if (a!=myList.get(b)){

            }

        }



    }


}