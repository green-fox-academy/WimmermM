import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountLetters {

    String hello;
    HashMap<Character,Integer> letters = new HashMap();

    public HashMap countLetters(String a){
        int value = 1;

        for (int i = 0; i < a.length() ; i++) {
            if (letters.containsKey(a.charAt(i))) {
                letters.put(a.charAt(i),letters.get(a.charAt(i)) +1);

            } else {
                letters.put(a.charAt(i),1);
            }
        }
        return letters;
    }


}

