package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.PrimitiveIterator;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
public class JPanelDemo extends JFrame{
    private Container c;
    private JPanel panel1,panel2;
    private JButton bt1,bt2,bt3;
    private JLabel label;
    private Font f;
    JPanelDemo() {
        initcomponents();
    }
    public void initcomponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f = new Font("Arial", Font.BOLD+Font.ITALIC,18);
        label = new JLabel("Here are two JPanels:");
        label.setBounds(20,30,200,50);
        label.setFont(f);
        c.add(label);

        panel1 = new JPanel();
        panel1.setBounds(100,100,250,300);
        panel1.setBackground(Color.RED);
        c.add(panel1);

        panel2 = new JPanel();
        panel2.setBounds(400,100,250,300);
        panel2.setBackground(Color.BLUE);
        c.add(panel2);

        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");

        panel1.add(bt1);
        panel1.add(bt3);
        panel2.add(bt2);

    }
    public static void main(String[] args) {
        JPanelDemo frame = new JPanelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 800, 600);
        frame.setTitle("JPanel example!");
    }
}
