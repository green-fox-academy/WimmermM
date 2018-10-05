public class String1 {

    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.

    public static void main(String[] args) {

        String result;
        result = computeToX("XaxaX");
        System.out.println(result);

    }

    public static String computeToX(String string){


        if (string.contains("x")){

            string.indexOf("x");
            return string.substring(0,0);

        }

        else {
            return string.concat("y") + computeToX(string);
        }



    }
}
