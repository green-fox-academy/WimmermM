import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    public static void main(String[] args) {

        String[][] matrix = new String[4][4];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {


            }

        }


        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (i==j){
                    System.out.print(" 1 ");
                }
                else {
                    System.out.print(" 0 ");
                }

            }
            System.out.println();
            }

    }


    }

