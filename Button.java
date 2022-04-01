package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JFrame {
    private Container c;
    private JButton var1,var2;
    private Font f;
    private Cursor cursor1,cursor2;
    private ImageIcon img1,img2;
    Button(){
        initcomponent();
    }
    public void initcomponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        img1= new ImageIcon(getClass().getResource("levi.ackerman.jpg"));
        img2= new ImageIcon(getClass().getResource("levi.ackerman.jpg"));
        cursor1 = new Cursor(Cursor.HAND_CURSOR);
        // to set pic on button
        var1 = new JButton(img1);
        // to set text on button
       // var1 = new JButton("Submit")
        var1.setBounds(100,50,100,50);
        var1.setForeground(Color.BLACK);
        var1.setBackground(Color.GREEN);
        var1.setCursor(cursor1);
        f = new Font("Arial",Font.BOLD,10);
        var1.setFont(f);
        c.add(var1);



        cursor2 = new Cursor(Cursor.MOVE_CURSOR);
        // to set pic on button
        var2 = new JButton(img2);
        // to set text on button
        // var2 = new JButton("clear")
        var2.setBounds(210,50,100,50);
        var2.setForeground(Color.BLACK);
        var2.setBackground(Color.BLUE);
        var2.setCursor(cursor2);
        f = new Font("Arial",Font.BOLD,10);
        var2.setFont(f);
        var2.setCursor(cursor2);
        c.add(var2);
    }
    public static void main(String[] args) {
         Button frame = new Button();
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setBounds(50,50,1200,800);
         frame.setTitle("Button......!");
    }
}
