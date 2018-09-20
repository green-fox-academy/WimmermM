import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Remaining hours");
        int hours = myScanner.nextInt();
        System.out.println("Remaining minutes");
        int minutes = myScanner.nextInt();
        System.out.println("Remaining seconds");
        int seconds = myScanner.nextInt();

        int hoursToSeconds = (hours*3600);
        int minutesToSeconds = (minutes *60);
        int totalSecondsLeft = (hoursToSeconds+minutesToSeconds+seconds);
        System.out.println("From this da remains :" + totalSecondsLeft + " seconds");

    }
}
