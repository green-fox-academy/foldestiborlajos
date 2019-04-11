import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxes {



        public static void mainDraw(Graphics graphics) {
            String[] rainBowli = {"Violet","Indigo","Blue","Green","Yellow", "Orange", "Red"};

            for ( int k = 0; k < 7; k++ ){
            int less =400 - (k * WIDTH/7);
            rainbowSquares(less,rainBowli[k], graphics);}


        }
        public static void rainbowSquares (int a, String color, Graphics graphics){
            String[] rainBow = {"Violet","Indigo","Blue","Green","Yellow", "Orange", "Red"};
            String[] rainHash = {"#9400D3", "#4B0082", "#0000FF","#00FF00","#FFFF00","#FF7F00","#FF0000"};
            for(int i = 0; i < rainBow.length; i++){
                if (color.equals(rainBow[i])){
                rainBow[i]=rainHash[i];
                graphics.setColor(Color.decode (rainHash[i]));
                graphics.fillRect(WIDTH/2 - a/2, WIDTH/2 - a/2, a, a);}
                 else{}
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






