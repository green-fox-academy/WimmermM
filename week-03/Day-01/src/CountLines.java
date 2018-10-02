import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {
    // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Write your file name: ");
        String userInput = myScanner.next();
        System.out.println(fileName(userInput));


    }


    public static int fileName (String file){

        int numberOfLines = 0;

        try {


            Path filePath = Paths.get(file);
            List<String> lines = Files.readAllLines(filePath);
            for (String line:lines) {

                numberOfLines++;


            }

        }catch (Exception e){

            numberOfLines =0;
        }


        return numberOfLines;
    }


}
