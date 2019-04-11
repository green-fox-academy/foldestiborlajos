import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class FourRectangle {

    public static void mainDraw(Graphics graphics) {

            for (int i = 100; i<200; i += 30){
                int z= i/2 ;
                int center = i;
                int winHei = i/2 -30;

                graphics.setColor(new Color(i, i , i ));
            graphics.drawRect(i, i/i+i,  winHei, winHei);
        }
    }

        static int WIDTH = 400;
        static int HEIGHT = 400;

        public static void main(String[] args)
        {
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


