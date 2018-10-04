public class String2 {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.


    public static void main(String[] args) {

        String result = new String();
        result = emoveChar("XxXxXxXxsdfusdbhfsdfxfsdfxkxoxjijxioxjxiojxioxx");
        System.out.println(result.replace(" ", ""));

    }


    public static String emoveChar (String string){

        if (string.contains(" ")){

            return string;


        }
        else {

            System.out.println(string);
            return emoveChar(string.replace("x", " "));



        }

    }













}
