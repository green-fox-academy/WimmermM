public class Exercise28 {

    // Write a program that reads a number from the standard input, then draws a
    // triangle like this:
    //
    // *
    // **
    // ***
    // ****
    //
    // The triangle should have as many lines as the number was

        public static void main(String[] args) {
            int lines = 0;
            int height = 5;
            while (lines<height){
                System.out.print("*");
                int counter = 0;
                while (counter<lines){
                    System.out.print("*");
                    counter = counter +1;
                }
                System.out.println();
                lines = lines +1;
            }


        }
    }

