public class Gnirts implements CharSequence{

    String myString;

    public Gnirts(String myString) {
        this.myString = myString;
    }



    @Override
    public int length() {
        return this.myString.length();
    }

    @Override
    public char charAt(int index) {
        return this.myString.charAt((length()-1)- index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.myString.substring(start,end);
    }
}
