package learning_swings;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Myframe extends JFrame {
    public Myframe() {
        this.setTitle("Hospital Billing System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(850, 575);

        ImageIcon icon = new ImageIcon(Myframe.class.getResource("img_1.png"));
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(Color.decode("#0049A3"));

        this.setVisible(true);
    }
}