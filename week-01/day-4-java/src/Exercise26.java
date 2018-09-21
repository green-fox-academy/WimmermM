import java.util.Scanner;

public class Exercise26 {
    // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("first number: ");
        int first = myScanner.nextInt();
        System.out.println("second number: ");
        int second = myScanner.nextInt();

        if (second<first){
            System.out.println("The second number should be bigger");
        }
        else if (second>first){
            for (int a = (first+1); a < second; a ++){
                System.out.println(a);
            }
        }
    }
}
