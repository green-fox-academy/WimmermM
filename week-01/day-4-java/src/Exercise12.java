import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args){
// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

        Scanner myScaner = new Scanner(System.in);
        System.out.println("Lenght of cuboid");
        double lenght = myScaner.nextDouble();
        System.out.println("Widht of cuboid");
        double widht = myScaner.nextDouble();
        System.out.println("Height of cuboid");
        double height = myScaner.nextDouble();

        double surface = (lenght*widht+lenght*widht+lenght*widht);
        double volume = (lenght*widht*height);

        System.out.println("Sourface area: " + surface);
        System.out.println("Volume :" + volume);



    }
}
