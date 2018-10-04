public class NumberAdder {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

    public static void main(String[] args) {



        int result = addNumber(4);
        System.out.println("\n Final result is  " + result);

    }


    public static int addNumber (int n){

        if (n <= 0){
            System.out.println(0);
            return 0;
        }

        else {
            System.out.print(n + "  + ");
            return n + addNumber(n - 1);
        }




    }

}
