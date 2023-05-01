import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {
        ImageIcon image_icon = new ImageIcon("image1.jpeg");
        image_icon.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);

        Border border = BorderFactory.createLineBorder(Color.green, 3);
        
        JLabel j_label = new JLabel();
        j_label.setText("Bro, do you even code?");
        j_label.setIcon(image_icon);
        j_label.setHorizontalTextPosition(JLabel.CENTER);
        j_label.setVerticalTextPosition(JLabel.CENTER);
        j_label.setForeground(new Color(0x00FF00));
        j_label.setFont(new Font("MV Boli", Font.PLAIN, 30));
        j_label.setIconTextGap(-25);
        j_label.setBackground(Color.black);
        j_label.setOpaque(true);
        j_label.setBorder(border);
        j_label.setVerticalAlignment(JLabel.CENTER);
        j_label.setHorizontalAlignment(JLabel.CENTER);
        // j_label.setBounds(100, 100, 300, 250);
    
        JFrame j_frame = new JFrame();
        j_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // j_frame.setSize(420, 420);
        // j_frame.setLayout(null);
        j_frame.setVisible(true);
        j_frame.add(j_label);
        j_frame.pack();
    }
}