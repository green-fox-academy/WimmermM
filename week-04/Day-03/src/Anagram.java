import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    public boolean angram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        char[] aList = a.toCharArray();
        char[] bList = b.toCharArray();
        Arrays.sort(aList);
        Arrays.sort(bList);
        boolean correct = true;

        for (int i = 0; i < aList.length; i++) {

            if (aList[i] == bList[i]) {

                correct = true;

            } else {

                correct = false;
            }
        }


        return correct;
    }


}

