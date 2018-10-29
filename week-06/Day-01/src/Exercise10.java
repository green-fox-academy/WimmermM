import java.util.ArrayList;
import java.util.List;

public class Exercise10 {

    /*Create a Fox class with 3 properties(name, type, color)
    Fill a list with at least 5 foxes, it's up to you how you name/create them!
    Write a Stream Expression to find the foxes with green color!
    Write a Stream Expression to find the foxes with green color and pallida type!

     */
    public static void main(String[] args) {


        List<Fox> foxList = new ArrayList<>();
        foxList.add(new Fox("red", "RedFox", "nonpallida"));
        foxList.add(new Fox("green", "GreenFox", "pallida"));
        foxList.add(new Fox("green", "BlueFox", "pallida"));
        foxList.add(new Fox("orange", "OrangeFox", "nonpallida"));
        foxList.add(new Fox("purple", "PurpleFox", "pallida"));


        foxList.stream().filter(fox -> fox.color =="green" && fox.type == "pallida").forEach(fox -> System.out.println(fox.name));

    }

}
