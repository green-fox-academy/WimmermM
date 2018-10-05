import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Graphic {
    public static void mainDraw(Graphics graphics) {
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.

        canvasWidht(0,0,WIDTH,graphics);



    }


    public static void canvasWidht(int x, int y, int size, Graphics graphics) {

        if (size > 0){

            graphics.drawLine (size/3 +x, y, size / 3 +x, size +y);
            graphics.drawLine(size * 2 / 3 +x, y, size * 2 / 3 +x, size+y);
            graphics.drawLine(x,size/3 + y,size +x,size/3 + y);
            graphics.drawLine(x,size*2/3 + y,size +x,size *2/3 +y);

            canvasWidht(size/3 +x,y,size/3,graphics);
            canvasWidht(x ,size /3 + y,size/3,graphics);
            canvasWidht(size /3 + x,size *2/3+ y,size/3,graphics);
            canvasWidht(size * 2/3 +x,size/3 + y,size/3,graphics);


        }
        else {



        }


//        graphics.drawLine (size/3, y, size / 3, size);
//        graphics.drawLine(size * 2 / 3, y, size * 2 / 3, size);
//        graphics.drawLine(x,size/3,size,size/3);
//        graphics.drawLine(x,size*2/3,size,size *2/3);


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