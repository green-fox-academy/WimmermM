import java.util.Scanner;

public class DivideByZero {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0


    public static void main(String[] args) {

        int result = divide(3);
        System.out.println(result);

    }



    public static Integer divide (int a){

        if (a==0){

            System.out.println("Fail");
        }

      return (10 / a);

    }




}
