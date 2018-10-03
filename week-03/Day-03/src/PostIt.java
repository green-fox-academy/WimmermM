public class PostIt {

    String backgroundColor;
    String text;
    String textColor;


    public static void main(String[] args) {

        PostIt orange = new PostIt();
        orange.backgroundColor = "orange";
        orange.text = "Idea 1";
        orange.textColor = "blue";

        PostIt pinkobject = new PostIt();
        pinkobject.backgroundColor = "pink";
        pinkobject.text = "Awesome";
        pinkobject.textColor = "black";

        PostIt yellowObject = new PostIt();
        yellowObject.backgroundColor = "yellow";
        yellowObject.text = "Superb!";
        yellowObject.textColor = "green";

    }


}