import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise9 {
    //Write a Stream Expression to convert a char array to a string!

    public static void main(String[] args) {
        char[] myChar = {'a', 'b', 'c', 'd'}; // array charu
        List<Character> myList = new ArrayList<>(); // vytvoreni npveho listu
        for (char a : myChar) { // loop na pridani charu do listu
            myList.add(a);

        }

        String myString = myList.stream(). // vytvoreni noveho stringu
                map(c -> c.toString()). // predelani listu na string
                collect(Collectors.joining("")); // spojeni stringu dohromadz
        System.out.println(myString); // vytisteni
    }
}
