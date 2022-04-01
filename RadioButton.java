package JavaSwing;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;


public class RadioButton extends JFrame{
    private Container c;
    private JRadioButton radio1,radio2;
    private Font f;
    private ButtonGroup buttongroup;
    private JTextArea ta;
    RadioButton(){
        initcomponents();
    }
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        f = new Font("Arial",Font.BOLD+Font.ITALIC,13);

        buttongroup = new ButtonGroup();
        radio1 = new JRadioButton("Male");
        radio1.setBounds(50,50,100,50);
        radio1.setForeground(Color.BLACK);
        radio1.setBackground(Color.CYAN);
        //radio1.setSelected(true);
        radio1.setFont(f);
        c.add(radio1);
        radio2 = new JRadioButton("Female");
        radio2.setBounds(50,120,100,50);
        radio2.setForeground(Color.BLACK);
        radio2.setBackground(Color.CYAN);
        //radio2.setSelected(true);
       // radio2.setEnabled(false);
        radio2.setFont(f);
        c.add(radio2);
        buttongroup.add(radio1);
        buttongroup.add(radio2);

        ta = new JTextArea();
        ta.setBounds(150,80,350,400);
        ta.setBackground(Color.PINK);
        ta.setFont(f);
        c.add(ta);

        radio1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(radio1.isSelected()){
                    ta.append("Male radio button is selected\n");
                }
                else{
                    ta.append("Female radio button is selected\n");
                }
            }
        });
        radio2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(radio2.isSelected()){
                    ta.append("Female radio button is selected\n");
                }
                else{
                    ta.append("Male radio button is selected\n");
                }
            }
        });
    }
    public static void main(String[] args) {
        RadioButton frame = new RadioButton();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,50,800,600);
        frame.setTitle("Radio Button !");
    }
}
