public class Exercise29 {

    // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was


    public static void main(String[] args) {

        for (int a = 0; a<5;a++){
            for (int b = 0;b<5-a;b++){
                System.out.print(" ");
            }
            for (int c =0;c<a;c++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
