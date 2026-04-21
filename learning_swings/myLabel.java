package learning_swings;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
public class myLabel extends JFrame {
    public myLabel() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(850, 575);

        JLabel label = new JLabel("Hello World!");  // ✅ create label
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setForeground(Color.WHITE);           // text color

        this.add(label);                            // ✅ add label to frame
        this.setVisible(true);
    }
}