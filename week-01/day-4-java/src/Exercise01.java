import java.util.Scanner;

public class Exercise01 {
        public static void main(String[] args){
            int number = 5;
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Hello, user! Please give me your name");
            String username = myScanner.nextLine();
            System.out.println("`Hello World!\"\\");
            System.out.println("Hello, " + username + "!");
            System.out.println(number);
        }
}
