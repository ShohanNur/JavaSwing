package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScrollPane extends JFrame{
    private Container c;
    private JTextArea var1;
    private Font f;
    private JScrollPane scroll;
    ScrollPane(){
        initcomponents();
    }
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f = new Font("Arial",Font.BOLD,16);
        var1 = new JTextArea();
//        var1.setBounds(50,50,300,200);
        var1.setFont(f);
        var1.setForeground(Color.BLACK);
        var1.setBackground(Color.PINK);
        var1.setLineWrap(true);
        var1.setWrapStyleWord(true);
//        c.add(var1);
        scroll = new JScrollPane(var1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(50,50,300,200);
        c.add(scroll);
    }
    public static void main(String[] args) {
        ScrollPane frame = new ScrollPane();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,800,600);
        frame.setTitle("Text Area......!");
    }
}
