package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class testFieldDemo extends JFrame {
    private Container c;
    private Font f;
    private JTextField var1,var2;
    testFieldDemo(){
        initComponents();
    }
    public void initComponents(){
        c = this.getContentPane(); // take the frame in the container
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f  = new Font("Arial",Font.ITALIC + Font.BOLD,18);

        var1 = new JTextField() ;
        var1.setBounds(50,30,200,50);
        var1.setFont(f);
        var1.setForeground(Color.GREEN); // set color of the text in the text feild
        var1.setBackground(Color.yellow);//set background color of the text feild
        var1.setHorizontalAlignment(JTextField.CENTER); // align the text feild

        c.add(var1);

        var2 = new JTextField();
        var2.setBounds(50,100,200,50);
        c.add(var2);
    }
    public static void main(String[] args) {
       testFieldDemo frame = new testFieldDemo();
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(100,50,1200,800);
       frame.setTitle("Text Feild !");

    }
}
