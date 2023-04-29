import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("JFrame title goes here.");
        // sett x-dimension, y-dimension
        this.setSize(420, 420);
        // frame cannot be resized!!!
        this.setResizable(false);
        // set frame visibility to true (make it visible)
        this.setVisible(true);
        // exit out of application when clicking the close button
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ImageIcon image_icon = new ImageIcon("logo.png");
        // j_frame.setIconImage(image_icon.getImage());
        
        this.getContentPane().setBackground(new Color(0x123456));
    }
}
