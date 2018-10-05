import javax.swing.*;

import java.awt.*;

import static java.awt.Window.getWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
    public static void mainDraw(Graphics graphics){

        carpet(0,0,WIDTH,graphics);

    }

    public static void carpet (int x,int y,int size, Graphics graphics){

        if (size > 0){
            graphics.fillRect(size/3 + x,size/3 + y,size/3, size/3);

            carpet(x,y,size/3,graphics);
            carpet(size * 2/3 + x,size * 2/3 + y,size/3,graphics);
            carpet(size*2/3 +x,y,size/3,graphics);
            carpet(x,size * 2/3 +y,size/3,graphics);
            carpet(x,size * 1/3 +y,size/3,graphics);
            carpet(size * 1/3 + x, y, size/3,graphics);
            carpet(size * 1/3 + x,size * 2/3 + y,size/3,graphics);
            carpet(size* 2/3 + x,size*1/3 + y,size/3,graphics);


        }

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