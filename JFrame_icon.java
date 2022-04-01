package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class JFrame_icon extends JFrame {
    private ImageIcon icon;
    private Container c;
    // constructor
    JFrame_icon(){
        initcomponents();
    }
    public void initcomponents(){
       // set Icon image  
       icon = new ImageIcon (getClass().getResource("picc.jpg"));
       this.setIconImage(icon.getImage());
       // set background color
       c = this.getContentPane();
       c.setBackground(Color.LIGHT_GRAY);
    }
    public static void main(String[] args) {
        JFrame_icon frame = new JFrame_icon();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200,400,500);
        frame.setTitle("Frame Demo");
        frame.setResizable(true);
    }
}
