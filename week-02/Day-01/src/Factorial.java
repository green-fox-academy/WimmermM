public class Factorial {

    //  Create the usual class wrapper
    //  and main method on your own.
    // - Create a function called `factorio`
    //   that returns it's input's factorial


    public static void main(String[] args) {


        System.out.println(factorio(1,2,3,4,5));

    }

    public static int factorio (int ...numbers){

        int result = 1;

        for (int i = 1; i <= numbers.length ; i++) {
            result *=i;

        }

        return(result);



    }


}
