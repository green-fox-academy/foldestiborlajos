import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {

        public static void mainDraw(Graphics graphics) {
            for (int pl = 0; pl < 400; pl += 80) {
                for (int row = 0; row < 10; row++) {
                        for (int i = 0; i < 400; i += 40) {
                            graphics.setColor(Color.black);
                            graphics.fillRect(  row * i, i * row + pl, 40, 40);
                            graphics.setColor(Color.black);
                            graphics.fillRect( 400 - (i *row ), 400-i*row -pl, 40, 40);
                            }

                        }

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

