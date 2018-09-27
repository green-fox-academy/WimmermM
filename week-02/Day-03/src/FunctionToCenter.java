import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

test(0,0,graphics);

    }


    public static void test (int a, int b, Graphics graphics){

        for (int i = 0; i <= 17; i++) {

            graphics.setColor(Color.RED);
            graphics.drawLine(a,b,WIDTH/2,HEIGHT/2);
            a+=20;

            if (i==17){

                for (int j = 0; j < 17; j++) {
                    graphics.setColor(Color.RED);
                    graphics.drawLine(a,b,WIDTH/2,HEIGHT/2);
                    b+=20;


                }


            }

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