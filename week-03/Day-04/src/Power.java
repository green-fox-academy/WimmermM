public class Power {

    // Given base and n that are both 1 or more, compute recursively (no loops)
    // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).


    public static void main(String[] args) {

        int result = powerToBase(2,4);
        System.out.println(result);

    }

    public static int powerToBase(int base , int n){

        if (n == 0){

            return base;
        }

        else {

            return base * powerToBase(base, -- n);

        }




    }





}
