import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful


    public static void main(String[] args) {

        System.out.println(copycat("my-file.txt"));

    }


    public static boolean copycat(String file) {


        try {
            Path filePath = Paths.get(file);
            List<String> lines = Files.readAllLines(filePath);
            Path filePath2 = Paths.get("my-file-copy2.txt");
            Files.write(filePath2, lines);


        } catch (Exception e) {
            return false;


        }


        return true;
    }


}
