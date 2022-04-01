package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class PasswordField extends JFrame {
    private Container c;
    private JPasswordField var1;
    private Font f;
    PasswordField(){
        initcomponents();
    }
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f = new Font("Helvetica",Font.ITALIC+Font.BOLD,16);
        var1 = new JPasswordField();
        var1.setEchoChar('x');  // set the sign in the password feild
        var1.setForeground(Color.BLACK);
        var1.setBackground(Color.RED);
        var1.setBounds(50,20,150,50);
        var1.setFont(f);
        c.add(var1);
    }
    public static void main(String[] args) {
        PasswordField frame = new PasswordField();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,800,600);
        frame.setTitle("JpasswordFeild.....!");
    }
}
