import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics){

        for (int i = 0; i < 160; i++) {
            for (int j = 0; j < i; j++) {


            }

        }




    }


    public  static  void triangle (double x, double y, Graphics graphics){

        graphics.setColor(Color.BLACK);
        graphics.drawLine(x,y,x-10,y+y*0.86);
        graphics.drawLine(x,y,x+10,y+y*0.86);
        graphics.drawLine(x-10,y+y*0.86,x+10,y+y*0.86);


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