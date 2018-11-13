public class Card {
    String value;
    String color;

    public Card(String value, String color) {
        this.value = value;
        this.color = color;
    }

    public int rank() {
        if (((Integer.parseInt(this.value) < 11)) && (Integer.parseInt(this.value) > 1)) {
            return Integer.parseInt(this.value);
        } else if (this.value.equals("J")) {
            return 11;
        } else if (this.value.equals("Q")) {
            return 12;
        } else if (this.value.equals("K")) {
            return 13;
        } else if (this.value.equals("A")) {
            return 14;
        }else {
            return 15;
        }
        }
    }


