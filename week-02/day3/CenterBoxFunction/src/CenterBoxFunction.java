import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {


        public static void mainDraw(Graphics graphics) {

            for(int i = 10; i < 400; i +=30 )
            centerBoxFunction(i, graphics);

            }

            public static void centerBoxFunction(int a, Graphics graphics){
             graphics.drawRect(WIDTH/2 - (a/2),HEIGHT/2 - (a/2), a, a);
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




