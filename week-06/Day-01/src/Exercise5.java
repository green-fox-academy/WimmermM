import java.util.ArrayList;
import java.util.Arrays;

//Write a Stream Expression to find the uppercase characters in a string!
public class Exercise5 {

    public static void main(String[] args) {

//        ArrayList<String> words = new ArrayList<>(Arrays.asList("Ano", "nE", "PeS", "KocKa", "AuTo", "JidLo", "stROM"));

        String gusta = "GuSaV";

        gusta.chars().filter(w -> (Character.isUpperCase(w))).forEach(w -> System.out.println((char)w));

    }
}
