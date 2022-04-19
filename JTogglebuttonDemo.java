package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.PrimitiveIterator;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class JTogglebuttonDemo extends JFrame implements ActionListener{
    private  Container c;
    private JToggleButton tb;
    private JLabel label;
    JTogglebuttonDemo(){
        initcomponents();
    }
    public void initcomponents(){
       c = this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.PINK);

       tb = new JToggleButton("OFF");
       tb.setBounds(50,50,250,250);
       c.add(tb);

       label = new JLabel("Toggle Button is clicked!");
       label.setBounds(50,350,150,50);
       label.setVisible(false);
       c.add(label);
       tb.addActionListener(this);
    }
    public static void main(String[] args) {
        JTogglebuttonDemo frame = new JTogglebuttonDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,800,600);
        frame.setTitle("JToggle!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(tb.isSelected()){
            tb.setText("ON");
            label.setVisible(true);
        }
        else{
            tb.setText("OFF");
            label.setVisible(false);
        }
    }
}
