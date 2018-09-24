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

        int[][] matrix = new int[0][1];

        int lenght = 4;
        int column = 0;
        int height = 0;


        for (int i = 0; i < lenght; i++) {

            for (int j = 0; j < lenght; j++) {
                System.out.println(matrix[0]);

                height += j;
            }

            column += i;

        }

        if (column==height){
            System.out.println(matrix[1]);
        }
        System.out.println();
    }


}
