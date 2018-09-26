import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]


        int a = 5;
        int b = 5;
        int c = 10;
        int d = 10;


        for (int i = 0; i < 6; i++) {


            Color myColor = new Color(148,0,211);
            graphics.setColor(myColor);
            graphics.fill3DRect(a,b,c,d,true);
            graphics.setColor(Color.BLACK);
            graphics.drawRect(a,b,c,d);
            a+=c;
            b+=d;
            c*=1.5;
            d*=1.5;


        }




    }

    // Don't touch the code below
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

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}