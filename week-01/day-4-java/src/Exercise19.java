public class Exercise19 {
    // Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot

    public static void main(String[] args){

        int i = 2;

        if(i <=0){
            System.out.println("Not enough");
        }
        else if (i==1){
            System.out.println("1");

        }
        else if (i==2){
            System.out.println("2");
        }
        else {
            System.out.println("A lot");
        }


    }
}
