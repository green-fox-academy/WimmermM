public class String3 {
    // Given a string, compute recursively a new string where all the
    //adjacent chars are now separated by a "*".


    public static void main(String[] args) {

        String result = new String();
        result = splitByStar("hello");
        System.out.println(result);

    }

    public static String splitByStar(String string) {

        if (string.contains("*")) {

            return string;


        } else {
            for (int i = 0; i < string.length(); i++) {
                string.split(" ", i);

            }

            return splitByStar(string.replace(" ", "*"));


        }


    }


}
