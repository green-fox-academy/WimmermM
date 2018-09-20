import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner myScanner = new Scanner(System.in);
        System.out.println("How man chicken do you have?");
        int chickens = myScanner.nextInt();
        System.out.println("How many pigs do you have?");
        int pigs = myScanner.nextInt();

        int totaChickenLegs = (chickens*2);
        int totalPigLegs = (pigs*4);
        System.out.println("All animales have togather : " + (totaChickenLegs+totalPigLegs) + " legs");



    }

}
