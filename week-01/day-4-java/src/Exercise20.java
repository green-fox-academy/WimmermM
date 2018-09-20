import java.util.Scanner;

public class Exercise20 {
    // Write a program that asks for two numbers and prints the bigger one
    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Add 1st number");
        int numberOne = myScanner.nextInt();
        System.out.println("Add 2nd number");
        int numberTwo = myScanner.nextInt();

        if(numberOne>numberTwo){
            System.out.println(numberOne);
        }

        if (numberOne<numberTwo){
            System.out.println(numberTwo);
        }





    }









}

