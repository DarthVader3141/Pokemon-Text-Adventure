import java.awt.*;
import javax.swing.*;

public class WindowHandler {

    public static void createWindow() {

        JFrame frame = new JFrame("FrameDemo"); //create a new JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets what happens if it is closed

        JLabel emptyLabel = new JLabel("");//make the label blank
        emptyLabel.setPreferredSize(new Dimension(175, 100)); //give it dimensions
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER); //put the blank label in the center
       
        frame.pack(); //Display the window.
        frame.setVisible(true);
    }
    
}