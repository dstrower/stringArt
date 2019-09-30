import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 * @author DT071977  (Dave Trower)
 *
 * This program simulates part of a string art project.
 * See https://github.com/dstrower/stringArt/blob/master/README.md for more details.
 *
**/

//cerner_2^5_2019

public class StringArt extends JFrame {
    //These arrays are the points of a circle, there are around 30 points on this circle
    Double[] x_values = new Double[] {445.63,432.71,411.80,383.83,350.00,311.80,270.91,229.09,188.20,150.00,116.17,88.20,67.29,54.37,50.00,54.37,67.29,88.20,116.17,150.00,188.20,229.09,270.91,311.80,350.00,383.83,411.80,432.71,445.63};
    Double[] y_values = new Double[] {291.58,331.35,367.56,398.63,423.21,440.21,448.90,448.90,440.21,423.21,398.63,367.56,331.35,291.58,250.00,208.42,168.65,132.44,101.37,76.79,59.79,51.10,51.10,59.79,76.79,101.37,132.44,168.65,208.42};

    public StringArt() {
        super("String Art");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        for(int i = 0 ;i < 100;i++) {
            g2d.setColor(new Color(0,0,0)); //This color is Black. Represents the smallest circle
            //Note that the 10 in the line below simulates skipping ten tacks for each string of thread.
            //The % in java is modulus. This is use to start over if the count goes of the number of points on the circle.
            g2d.draw(new Line2D.Double(x_values[i % x_values.length],y_values[i % x_values.length],x_values[(i+10) % x_values.length],y_values[(i+10)% x_values.length ]));

            g2d.setColor(new Color(255,0,0));  //This color is Red.
            //Note that the 40 in the line below simulates skipping forty tacks for each string of thread.
            g2d.draw(new Line2D.Double(x_values[i % x_values.length],y_values[i % x_values.length],x_values[(i+40) % x_values.length],y_values[(i+40)% x_values.length ]));


            g2d.setColor(new Color(255,255,0)); //This color is Yellow.
            //Note that the 40 in the line below simulates skipping twenty tacks for each string of thread.
            g2d.draw(new Line2D.Double(x_values[i % x_values.length],y_values[i % x_values.length],x_values[(i+20) % x_values.length],y_values[(i+20)% x_values.length ]));
        }
    }

    public static void main(String[] args) {
        new StringArt().setVisible(true);
    }
}
