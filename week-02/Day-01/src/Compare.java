import java.util.Arrays;

public class Compare {

    // - Create an array variable named `p1`
    //   with the following content: `[1, 2, 3]`
    // - Create an array variable named `p2`
    //   with the following content: `[4, 5]`
    // - Print if `p2` has more elements than `p1`

    public static void main(String[] args) {

        int[]p1 = {1,2,3};
        int[]p2 = {4,5,6,7,8,9};

        if (p1.length < p2.length){
            System.out.println(Arrays.toString(p2));
        }

    }
}
