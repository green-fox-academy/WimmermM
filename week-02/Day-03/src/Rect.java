import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;

public class Rect {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        duplication(10,6, 8,13,graphics);

    }



    public static void duplication(int a,int b, int c, int d,Graphics graphics){

        for (int i = 0; i < 4; i++) {

            int r = 100 + (int)(Math.random()*100);
            int g = 100 + (int)(Math.random()*100);
            int w = 100 + (int)(Math.random()*100);


            Color myColor = new Color(r,g,w);
            graphics.setColor(myColor);
            graphics.fillRect(a,b,c,d);

            a=a+=75;
            b=b+=12;
            c=c+=30;
            d=d+=20;
        }

    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;
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