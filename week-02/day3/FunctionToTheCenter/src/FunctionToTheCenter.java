import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToTheCenter {

        public static void mainDraw(Graphics graphics) {

            for(int i = 0; i < 300; i += 100 ) {
                int x = i;
                int y= i/2;
                goToCenter(x, y, graphics);
            }
        }

        public static void goToCenter(int x, int y, Graphics graphics ){
            graphics.drawLine(WIDTH/2, HEIGHT/2, x,y );
        }

        static int WIDTH = 400;
        static int HEIGHT = 400;

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


