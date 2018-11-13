import java.util.ArrayList;
import java.util.List;

public class PokerHand {

    List<String> white = new ArrayList();
    List<String> black = new ArrayList();






    public String winner (List list){

        return "white";
    }

    public int cardValue (String card) {
        card = "0";
        int result = Integer.parseInt(card);

        return result;
    }


    public int cardSum (ArrayList myList){
        myList.add("2H");
        myList.add("3D");
        myList.add("5S");
        myList.add("9C");
        myList.add("KD");
        int summ = 0;

        for (Object c :myList) {

            summ ++;
        }


        return summ;
    }



    }




