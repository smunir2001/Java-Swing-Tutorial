import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// implements ActionListener
public class MyFrame extends JFrame {

    JButton button;
    JLabel label;

    public MyFrame() {
        label = new JLabel("Here is the hidden label!");
        label.setBounds(100, 500, 250, 250);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200, 100, 250, 100);
        button.setText("I am a button!");
        button.setFocusable(false);
        button.addActionListener(e -> System.out.println("poo"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("poo");
            label.setVisible(true);
        }
    }
}
