import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {

    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.


    public static void main(String[] args) {

        System.out.println(ratio());

        try {
            Path filePath = Paths.get("log.txt");
            List<String>allData = Files.readAllLines(filePath);

        }

        catch (Exception e) {

        }

    }



    public static int ratio (){
        List<String> get = new ArrayList();
        int ratioResult =0;

        try {
            Path ratioFile = Paths.get("log.txt");
            List<String> ratioData = Files.readAllLines(ratioFile);
            for (String ratioValue:ratioData) {
                ratioValue.contains("GE");
                get.add(ratioValue);

            }
        }


        catch (Exception e){
            
        }

        for (int i = 0; i < get.size(); i++) {
            ratioResult = i;

        }




        return ratioResult;
    }
















}



