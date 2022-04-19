package JavaSwing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.util.PrimitiveIterator;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class SliderProject extends JFrame implements ChangeListener {
    private Container c;
    private JLabel redL,greenL,blueL,prevL;
    private JSlider redS,greenS,blueS;
    private JTextField redTf,greenTf,blueTf;
    private JPanel panel;

    SliderProject(){
        initcomponents();
    }
    public void initcomponents(){
     c = this.getContentPane();
     c.setBackground(Color.PINK);
     c.setLayout(null);

     redL = new JLabel("Red");
     redL.setBounds(50,50,100,50);
     c.add(redL);

     redS = new JSlider(0,255,0);
     redS.setBounds(100,50,200,50);
     redS.setMinorTickSpacing(5);
     redS.setMinorTickSpacing(25);
//     redS.setPaintLabels(true);
     redS.setPaintTicks(true);
     c.add(redS);

     redTf = new JTextField();
     redTf.setBounds(320,50,110,50);
     c.add(redTf);

        greenL = new JLabel("Green");
        greenL.setBounds(50,120,100,50);
        c.add(greenL);

        greenS = new JSlider(0,255,0);
        greenS.setBounds(100,120,200,50);
        greenS.setMinorTickSpacing(5);
        greenS.setMinorTickSpacing(25);
//     redS.setPaintLabels(true);
        greenS.setPaintTicks(true);
        c.add(greenS);

        greenTf = new JTextField();
        greenTf.setBounds(320,120,110,50);
        c.add(greenTf);

        blueL = new JLabel("Blue");
        blueL.setBounds(50,200,100,50);
        c.add(blueL);

        blueS = new JSlider(0,255,0);
        blueS.setBounds(100,200,200,50);
        blueS.setMinorTickSpacing(5);
        blueS.setMinorTickSpacing(25);
//     redS.setPaintLabels(true);
        blueS.setPaintTicks(true);
        c.add(blueS);

        blueTf = new JTextField();
        blueTf.setBounds(320,200,110,50);
        c.add(blueTf);

        panel = new JPanel();
        panel.setBounds(460,50,200,200);
        panel.setBackground(Color.CYAN);
        c.add(panel);

        redS.addChangeListener(this);
        greenS.addChangeListener(this);
        blueS.addChangeListener(this);
    }
    public static void main(String[] args) {
        SliderProject frame = new SliderProject();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,800,600);
        frame.setTitle("Slider Project!");
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int redval = redS.getValue();
        int greenval = greenS.getValue();
        int blueval = blueS.getValue();

        redTf.setText(""+redval);
        greenTf.setText(""+greenval);
        blueTf.setText(""+blueval);

        Color color = new Color(redval,greenval,blueval); // r g b values
        panel.setBackground(color);
    }
}
