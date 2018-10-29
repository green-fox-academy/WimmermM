import java.util.ArrayList;
import java.util.Arrays;

public class Exercise6 {

    //Write a Stream Expression to find the strings which starts with A and ends with I in the following array:

    public static void main(String[] args) {


        ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

        cities.stream().filter(c -> c.startsWith("A") && c.endsWith("I")).forEach(c -> System.out.println(c));
    }
}
