import java.applet.*;
import java.awt.*;
import javax.swing.JFrame;
public class Myapplet  extends Applet {
public void paint (Graphics g)
{
g.drawString("Hello friends",500,100);
}

public static void main(String[] args) {
        JFrame frame = new JFrame("My Applet Application");
        Myapplet applet = new Myapplet();

     frame.add(applet); // Add the applet to the frame
    frame.setSize(new Dimension(400, 300)); // Set a suitable size for the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
    frame.setVisible(true); // Make the frame visible

        applet.init(); // Initialize the applet
        applet.start(); // Start the applet
    }
}
