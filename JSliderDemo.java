package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.PrimitiveIterator;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class JSliderDemo extends JFrame {
    private Container c;
    private JSlider slider;
    JSliderDemo(){
        initcomponents();
    }
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        slider = new JSlider(0,20,0);
        slider.setBounds(100,50,300,50);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        c.add(slider);
    }
    public static void main(String[] args) {
        JSliderDemo frame = new JSliderDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,800,600);
        frame.setTitle("JSlider Demo!");
    }
}
