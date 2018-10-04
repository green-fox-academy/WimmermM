public class Bunny2 {

    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
    // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
    // have 3 ears, because they each have a raised foot. Recursively return the
    // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).


    public static void main(String[] args) {

//        int result2 = bunniesLine2(9);
        int result1 = bunniesLine1(20);
        System.out.println(result1);

    }

    public static int bunniesLine1(int bunny) {

        int ears1 = 2;
        int ears2 = 3;

        if (bunny == 0) {

            return 0;
        } else if (bunny % 2!=0){
            return ears2 + bunniesLine1(bunny -1);
        }
        else {
            System.out.println(bunny);
            return ears2 + ears1 + bunniesLine1(bunny - 2);
        }


    }

//    public static int bunniesLine2 (int bunny){
//
//        int ears2 = 3;
//
//        if (bunny == 0){
//            return  0;
//        }
//        else {
//            System.out.println(bunny);
//            return ears2 + bunniesLine2(bunny -3);
//        }
//    }


}
