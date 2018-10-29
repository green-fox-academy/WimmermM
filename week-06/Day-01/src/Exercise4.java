import java.util.ArrayList;
        import java.util.Arrays;

public class Exercise4 {

    //Write a Stream Expression to find which number squared value is more then 20 from the following array:

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
        numbers.stream().filter(x -> (x * x) > 20).forEach(x -> System.out.println(x));
    }
}
