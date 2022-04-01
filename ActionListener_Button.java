package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListener_Button extends JFrame{
    private Container c;
    private JButton button1;
    private JTextField text1;
    private Font f;
    private Cursor cursor1,cursor2;
    private ImageIcon img1,img2;
    ActionListener_Button(){
        initcomponent();
    }
    public void initcomponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);

        text1 = new JTextField();
        text1.setBounds(50,50,150,50);
        c.add(text1);

        button1 = new JButton("Clear");
        button1.setBounds(50,110,80,50);
        c.add(button1);

        // Action listener
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 text1.setText("xxxx");
            }
        });

    }
    public static void main(String[] args) {
        ActionListener_Button frame = new ActionListener_Button();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,50,1200,800);
        frame.setTitle("ActionListenerButton......!");
    }
}
