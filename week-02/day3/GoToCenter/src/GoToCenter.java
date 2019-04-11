
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {

    public static void mainDraw(Graphics graphics) {

        for(int i = 0; i <400; i += 20) {
            {

            goToCenter(i, 0, graphics);
            goToCenter(0, i, graphics);
            goToCenter(400, 400-i,graphics);
            goToCenter(400-i,400, graphics);
        }
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
