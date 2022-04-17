package JavaSwing;

import java.awt.*;
import javax.swing.JFrame;

public class DisplayGraphics extends Canvas{

    public void paint(Graphics g) {
       // g.drawString("Hello",40,40);
        setBackground(Color.GREEN);
        //g.fillRect(130, 30,100, 80);
       // g.drawOval(30,130,50, 60);
        //setForeground(Color.RED);
        g.fillOval(200,90,150, 150);
        setForeground(Color.RED);
       // g.drawArc(30, 200, 40,50,90,60);
       // g.fillArc(30, 130, 40,50,180,40);

    }
    public static void main(String[] args) {
        DisplayGraphics m=new DisplayGraphics();
        JFrame f=new JFrame("Bangladesh flag");
        f.add(m);
        f.setSize(600,360);
        //f.setLayout(null);
        f.setVisible(true);
    }

}