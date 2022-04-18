package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.PrimitiveIterator;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class CardLayoutDemo  extends JFrame implements ActionListener{
    private Container c;
    private GridLayout grid;
    private JButton bt1, bt2, bt3, bt4, bt5,bt6;
    private CardLayout card;
    private Font f;

    CardLayoutDemo() {
        initcomponents();
    }

    public void initcomponents() {
        c = this.getContentPane();
        c.setBackground(Color.PINK);
        card = new CardLayout(10,10);
        c.setLayout(card);
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");

        c.add(bt1,"first");
        c.add(bt2,"second");
        c.add(bt3,"third");

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
    }
    public static void main(String[] args) {
        CardLayoutDemo frame = new CardLayoutDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 800, 600);
        frame.setTitle("flow Layout Demo!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        card.show(c,"third");
        //card.next(c);
        //card.previous(c);
    }
}
