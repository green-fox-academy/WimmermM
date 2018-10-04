public class Bunny1 {

    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).


    public static void main(String[] args) {

        int result = bunnies(10);
        System.out.println(result);


    }

    public static int bunnies(int bunny){

        int ears = 2;
        if (bunny == 0){

            return 0;

        }
        else {
            System.out.println(bunny);
            return ears + bunnies(bunny-1);
        }

    }





}
