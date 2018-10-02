import java.util.Scanner;

public class DivideByZero {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Add number you want to divide");
        int userInput1 = myScanner.nextInt();
        divide(userInput1);

    }



    public static Integer divide (int a){


        try {

            int result = (10/a);
            System.out.println("Result is : " + result);

    }
    catch (Exception e){
        System.out.println("Fail");
    }

        return (a);
    }




}
