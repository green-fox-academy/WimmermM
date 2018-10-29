import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise2 {

    public static void main(String[] args) {

        int sum = 0;
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        Double averageNumber = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.averagingInt(x -> x));
        System.out.println(averageNumber);

    }
}
