public class String1 {

    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.

    public static void main(String[] args) {

        String result;
        result = computeToX("XerxesxxxxXxXxXx");
        System.out.println(result);

    }

    public static String computeToX(String string){


        if (string.contains("y")){

            return string;
        }

        else {
            System.out.println(string);
            return computeToX(string.replace("x","y"));
        }




    }
}
