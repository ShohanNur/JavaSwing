package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.PrimitiveIterator;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class BorderLayoutDemo extends JFrame {
    private Container c;
    private BorderLayout bl;
    private JButton bt1,bt2,bt3,bt4,bt5;

    private Font f;
    BorderLayoutDemo() {
        initcomponents();
    }
    public void initcomponents() {
        c = this.getContentPane();
        c.setBackground(Color.RED);
        bl = new BorderLayout(10,5);
        //bl.setHgap(10)
        //bl.setVgap(5)
        c.setLayout(bl); // set layout as border layout

        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        bt5 = new JButton("5");

        c.add(bt1,BorderLayout.NORTH);
        c.add(bt2,BorderLayout.WEST);
        c.add(bt3,BorderLayout.EAST);
        c.add(bt4,BorderLayout.SOUTH);
        c.add(bt5,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        BorderLayoutDemo frame = new BorderLayoutDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 800, 600);
        frame.setTitle("Border Layout !");
    }
}
