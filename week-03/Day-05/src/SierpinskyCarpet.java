import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
    public static void mainDraw(Graphics graphics){
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.

//        carpet(WIDTH/2 -25,HEIGHT/2 -25,graphics);
    }

    public static void carpet (int x,int y, Graphics graphics){
        graphics.fillRect(x,y,50,50);


    }

    public static int checkForSpace(int x, int y){
        while (x > 0 || y > 0) // when either of these reaches zero the pixel is determined to be on the edge
        // at that square level and must be filled
        {
            if (x % 3 == 1 && y % 3 == 1) //checks if the pixel is in the center for the current square level
                return 0;
            x /= 3; //x and y are decremented to check the next larger square level
            y /= 3;
        }
        return 1; // if all possible square levels are checked and the pixel is not determined
        // to be open it must be filled


    }




    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}