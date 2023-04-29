import java.awt.FlowLayout;
import javax.swing.*;
public class SwingDemo {
    public static void main(String[] args) {
        JFrame j_frame = new JFrame("User Form");
        j_frame.setSize(300, 600);
        j_frame.setLayout(new FlowLayout());
        j_frame.setVisible(true);

        JLabel l1 = new JLabel("Username:");
        j_frame.add(l1);
        JTextField t1 = new JTextField(20);
        j_frame.add(t1);
        JLabel l2 = new JLabel("Password:");
        j_frame.add(l2);
        JTextField t2 = new JTextField(20);
        j_frame.add(t2);
        JButton j_button = new JButton("Submit");
        j_frame.add(j_button);
    }
}