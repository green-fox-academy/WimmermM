import java.util.Scanner;

public class Exercise17 {
    // Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Add 1st number");
        int first = myScanner.nextInt();
        System.out.println("Add 2nd number");
        int second = myScanner.nextInt();
        System.out.println("Add 3rd number");
        int third = myScanner.nextInt();
        System.out.println("Add 4th number");
        int fourth = myScanner.nextInt();
        System.out.println("Add 5th number");
        int fifth = myScanner.nextInt();

        int summ = (first+second+third+fourth+fifth);
        double average = (summ / 5);

        System.out.println("Sum : " + summ);
        System.out.println("Average : " + average);
    }



}
