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
        System.out.println(getUniqueIps("log.txt").size());



    }


    public static List<String> getUniqueIps(String filename){
        List<String> uniqueIps = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            for (String line: lines) {
                String currentIP = line.split("   ")[1];
                if (!uniqueIps.contains(currentIP)){
                    uniqueIps.add(currentIP);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return uniqueIps;
    }

    public static List<String> getPostRatio(String filename){
        int get = 0, post = 0;
        List<String> uniqueIps = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            for (String line: lines) {
                if (line.contains("POST")){
                    post++;
                }
                if (line.contains("GET")){
                    get++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return uniqueIps;
    }






}



