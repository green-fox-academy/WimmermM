public class Summing {

    //  Create the usual class wrapper
    //  and main method on your own.
    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer


    public static void main(String[] args) {

        System.out.println(sum(5));
    }

    public static int sum(int a){

        int sum =0;

        for (int i = 0; i < a; i++) {

            sum += i;
        }

        return(sum);
    }

}


