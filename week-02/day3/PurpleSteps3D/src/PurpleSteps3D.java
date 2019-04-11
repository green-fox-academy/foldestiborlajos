import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {

        public static void mainDraw(Graphics graphics) {

            for (int i = 1; i < 400; i *= 2)  {
                int xy = i*2 + i*2;
                int diag = i*2 + i*2;

                graphics.setColor(new Color(128, 0, 128));
                graphics.fill3DRect(diag, diag, xy,xy, true);}
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

