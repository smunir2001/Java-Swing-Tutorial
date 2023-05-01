/*
 * JPanel
 * - a GUI component that functions as a container 
 *      to hold other component.
 */
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        JLabel j_label_1 = new JLabel();
        j_label_1.setText("Panel #1");
        j_label_1.setForeground(Color.WHITE);
        JLabel j_label_2 = new JLabel();
        j_label_2.setText("Panel #2");
        j_label_2.setForeground(Color.WHITE);
        JLabel j_label_3 = new JLabel();
        j_label_3.setText("Panel #3");
        j_label_3.setForeground(Color.WHITE);
        JLabel j_label_4 = new JLabel();
        j_label_4.setText("Panel #4");
        j_label_4.setForeground(Color.WHITE);

        JPanel red_panel = new JPanel();
        red_panel.setBackground(Color.red);
        red_panel.setBounds(0, 0, 250, 250);
        red_panel.add(j_label_1);
        JPanel blue_panel = new JPanel();
        blue_panel.setBackground(Color.blue);
        blue_panel.setBounds(250, 0, 250, 250);
        blue_panel.add(j_label_2);
        JPanel green_panel = new JPanel();
        green_panel.setBackground(Color.green);
        green_panel.setBounds(500, 0, 250, 250);
        green_panel.add(j_label_3);
        JPanel pink_panel = new JPanel();
        pink_panel.setBackground(Color.pink);
        pink_panel.setBounds(0, 250, 500, 250);
        pink_panel.add(j_label_4);

        JFrame j_frame = new JFrame();
        j_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j_frame.setLayout(null);
        j_frame.setSize(750, 750);
        j_frame.setVisible(true);
        j_frame.add(red_panel);
        j_frame.add(blue_panel);
        j_frame.add(green_panel);
        j_frame.add(pink_panel);
    }
}