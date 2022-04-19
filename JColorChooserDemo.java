package JavaSwing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.util.PrimitiveIterator;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class JColorChooserDemo extends JFrame implements ActionListener{
    private Container c;
    private JButton bt;
    JColorChooserDemo(){
        initcomponents();
    }
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);

        bt = new JButton("Click here!");
        bt.setBounds(100,100,200,80);
        c.add(bt);
        bt.addActionListener(this);
    }
    public static void main(String[] args) {
        JColorChooserDemo frame = new JColorChooserDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,800,600);
        frame.setTitle("JColorChooser Demo!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color color = JColorChooser.showDialog(null,"Select a color",Color.orange);
        c.setBackground(color);
    }
}
