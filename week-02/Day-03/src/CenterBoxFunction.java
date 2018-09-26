import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 1 parameter:
        // the square size
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.

        square(100,graphics);

    }

    public static void square (int a , Graphics graphics){

        for (int i = 0; i < 3 ; i++) {


            int r = 100 + (int)(Math.random()*100);
            int g = 100 + (int)(Math.random()*100);
            int w = 100 + (int)(Math.random()*100);

            Color myColor = new Color(r,g,w);
            graphics.setColor(myColor);
            graphics.fillRect(WIDTH/2 - a/2,HEIGHT/2 - a/2,a,a);
            a-=a/2;

        }


    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}