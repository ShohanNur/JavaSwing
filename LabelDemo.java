package JavaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class LabelDemo extends JFrame {
    private Container c;
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane scroll;
    private JLabel label;
    private ImageIcon icon;
    LabelDemo() {
        initcomponents();
    }
    public void initcomponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        icon = new ImageIcon(getClass().getResource("xx.jpeg"));

        label = new JLabel("This is a pic",icon,JLabel.LEFT);
        label.setBounds(50,50,350,240);
        c.add(label);
    }
    public static void main(String[] args) {

        LabelDemo frame = new LabelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 800, 600);
        frame.setTitle("Image on JLabel with text!");
    }
}