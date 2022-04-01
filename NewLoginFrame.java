package JavaSwing;

import javax.swing.*;
import java.awt.*;
public class NewLoginFrame extends JFrame {
    private Container c;
    private JLabel x;
    NewLoginFrame(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        x = new JLabel("Hello Everyone !");
        x.setBounds(50,50,250,50);
        c.add(x);
    }
    public static void main(String[] args) {
        NewLoginFrame fr = new NewLoginFrame();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setBounds(420,200,400,400);
        fr.setTitle("New Login Frame!!");
    }
}
