import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class BigTriangle {

    static int WIDTH = 400;
    static int HEIGHT = 400;

    public static void mainDraw(Graphics graphics) {


        drawTree(graphics, WIDTH/2,   WIDTH, 10);

    }

    public static void drawTree(Graphics graphics, int a, int b, int c) {

        int d = c * 2;
        graphics.drawLine(a, b, a+c, b - d);
        graphics.drawLine(a,b, a-c, b - d );
         if(b<WIDTH){
             graphics.drawLine(a+10, b-d, a-10, b-d);
         }

        if (b <= 100) {graphics.drawRect(380,380,10,10);
        }else {
            drawTree(graphics, a+10, b - d, c);
            drawTree(graphics, a-10, b - d, c);


        }
    }


        public static void main (String[]args){
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

