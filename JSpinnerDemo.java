package JavaSwing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.util.PrimitiveIterator;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class JSpinnerDemo extends JFrame implements ChangeListener{
    private  Container c;
    private JSpinner spinner;
    private JLabel label;
    private Font f;
    JSpinnerDemo(){
        initcomponents();
    }
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        SpinnerNumberModel val = new SpinnerNumberModel(20,-10,40,1);
        spinner = new JSpinner(val);
        spinner.setBounds(100,100,100,100);
        c.add(spinner);
        spinner.addChangeListener(this);

        f = new Font("Arial",Font.BOLD+Font.ITALIC,22);
        label = new JLabel("Current Value 20");
        label.setBounds(300,100,300,150);
        label.setFont(f);
        c.add(label);
    }
    public static void main(String[] args) {
        JSpinnerDemo frame = new JSpinnerDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,800,600);
        frame.setTitle("JSpinner Demo!");
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        String s = spinner.getValue().toString();
        int val = Integer.parseInt(s);
        label.setText("Current Value "+val);

    }
}
