import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.

        graphics.setColor(Color.RED);
        graphics.drawLine(WIDTH /2,HEIGHT /2,250,HEIGHT /2);
        graphics.setColor(Color.BLACK);
        graphics.drawLine(WIDTH /2,HEIGHT /2,WIDTH /2,250);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(WIDTH/2,250,250 ,250);
        graphics.setColor(Color.MAGENTA);
        graphics.drawLine(250,250,250,HEIGHT /2);



    }

    // Don't touch the code below
    static int WIDTH = 320; //x /2 = 160
    static int HEIGHT = 343; //y = 171

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