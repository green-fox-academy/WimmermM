public class Exercise11 {
    public static void main(String[] args) {
        int a = 3;
        a += 10;
        // make it bigger by 10
        System.out.println(a);

        int b = 100;
        b -= 7;
        // make it smaller by 7
        System.out.println(b);


        int c = 44;
        c *= 2;
        // please double c's value
        System.out.println(c);

        int d = 125;
        d /= 5;
        // please divide by 5 d's value
        System.out.println(d);

        int e = 8;
        // please cube of e's value
        System.out.println(e*e*e);


        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
            if (f1 > f2){
                System.out.println(true);
            }

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        double g3 = (double) g1;
        double g4 = (double) g2;
        if (g4 > g3){
            System.out.println(true);
        }

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        int h2 = (h%11);
        if (h2 == 11){
            System.out.println(true);

        }

        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        int i3 = (i2*i2*i2);
        int i4 =(i2*i2);
        if (i1 > i3 || i1 > i4){
            System.out.println(true);
        }

        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        if (j == 5 ||j==3){
            System.out.println(true);
        }

        String k = "Apple";
        //fill the k variable with its cotnent 4 times
        String temp = k;
        k = "Tonda";
        System.out.println(k);
        k = "Apple";
        System.out.println(k);
        k = "tree";
        System.out.println(k);
        k= "gol";
        System.out.println(k);
    }
}
