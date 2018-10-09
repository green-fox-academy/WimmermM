public class Shifter implements CharSequence {

    String shifterString;
    int number;

    public Shifter(String shifterString,int number) {
        this.shifterString = shifterString;
        this.number = number;
    }


    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.shifterString.charAt(number);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
