public class Arguments {

    //  Create the usual class wrapper
    //  and main method on your own.
    // - Create a function called `printParams`
    //   which prints the input String parameters
    // - It can have any number of parameters
    // Examples
    // printParams("first")
    // printParams("first", "second")
    // printParams("first", "second", "third", "fourh")
    // ...


    public static void main(String[] args) {

        System.out.println(printParams(" First ", " sdadasd ", " sdadda "));

    }


    public static String printParams (String... words){

        String result = "";

        for (String word : words) {

            result +=word;


        }

        return (result);

    }

}
