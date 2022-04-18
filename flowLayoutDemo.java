package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.PrimitiveIterator;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
public class flowLayoutDemo extends JFrame {
    private Container c;
    private FlowLayout fl;
    private JButton bt1, bt2, bt3, bt4, bt5;

    private Font f;

    flowLayoutDemo() {
        initcomponents();
    }

    public void initcomponents() {
        c = this.getContentPane();
        c.setBackground(Color.RED);
        fl = new FlowLayout();
        c.setLayout((LayoutManager) fl);

        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        bt5 = new JButton("5");

        c.add(bt1);
        c.add(bt2);
        c.add(bt3);
        c.add(bt4);
        c.add(bt5);
    }

    public static void main(String[] args) {
        flowLayoutDemo frame = new flowLayoutDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 800, 600);
        frame.setTitle("flow Layout Demo!");
    }
}
