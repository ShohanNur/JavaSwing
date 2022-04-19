package JavaSwing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.util.PrimitiveIterator;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class TabbedPaneDemo extends JFrame {
    private Container c;
    private JTabbedPane tp;
    private JPanel panel1,panel2,panel3;
    private JLabel label1,label2,label3;
    private ImageIcon icon;
    TabbedPaneDemo(){
        initcomponents();
    }
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        tp = new JTabbedPane();
        tp.setBounds(50,50,300,300);
        c.add(tp);

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.BLUE);

        icon = new ImageIcon("src/JavaSwing/picc.jpg");
        // resizing image
        Image img = icon.getImage();
        Image newimg = img.getScaledInstance(30,30,Image.SCALE_SMOOTH);
        icon = new ImageIcon(newimg);

        tp.addTab("Home",icon,panel1,"It is home icon");
        tp.addTab("Gallery",panel2);
        tp.addTab("Settings",panel3);

        label1 = new JLabel("This is Home!");
        label2 = new JLabel("This is Gallery!");
        label3 = new JLabel("This is Settings!");

        panel1.add(label1);
        panel2.add(label2);
        panel3.add(label3);

    }
    public static void main(String[] args) {
        TabbedPaneDemo frame = new TabbedPaneDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,800,600);
        frame.setTitle("JTabbedPane Demo!");
    }
}
