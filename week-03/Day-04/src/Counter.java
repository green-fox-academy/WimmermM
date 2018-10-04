public class Counter {
    // Write a recursive function that takes one parameter: n and counts down from n.


    public static void main(String[] args) {


        factorialWithRecursion(4);

    }




    public static int factorialWithRecursion(int n){

        if (n <= 0){
            System.out.println(0);
            return 0;
        }
        else {
            System.out.println(n);
            return factorialWithRecursion(n -1);

        }


    }
}
