import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise7 {

    //Write a Stream Expression to find the frequency of characters in a given string!

    public static void main(String[] args) {

        String myString = "worldofwarcraft";

        Map<Character, Long> myMap = myString.chars() //vztvarim hashMap a pridelavam ji na stream charu (sou to inty)
                .mapToObj(c ->(char)c) // prevadim mapu na objecty kde se s intu delaji chary
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())); // pridavam udaje do mapy a rozdeluji na inty a chary, nasledne pocitam kolik

        System.out.println(myMap); //tisknu mapu

    }
}
