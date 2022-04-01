package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea extends JFrame{
    private Container c;
    private JTextArea var1;
    private Font f;
    TextArea(){
        initcomponents();
    }
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f = new Font("Arial",Font.BOLD,16);
        var1 = new JTextArea();
        var1.setBounds(50,50,300,200);
        var1.setFont(f);
        var1.setForeground(Color.BLACK);
        var1.setBackground(Color.PINK);
        var1.setLineWrap(true);
        var1.setWrapStyleWord(true);
        c.add(var1);
    }
    public static void main(String[] args) {
        TextArea frame = new TextArea();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,800,600);
        frame.setTitle("Text Area......!");
    }
}
