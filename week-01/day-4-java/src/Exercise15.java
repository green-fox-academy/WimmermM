import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Add distance in kilometers");
        int distance = myScanner.nextInt();

        double miles = (distance * 0.6);
        System.out.println("Distance in miles: " + miles);


    }
}
