package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actionListener extends JFrame {
    private Container c;
    private JTextField var1,var2;
    actionListener(){
        initcomponents();
    }
    public void initcomponents(){
           c = this.getContentPane();
           c.setLayout(null);
           c.setBackground(Color.yellow);

           var1 = new JTextField();
           var1.setBounds(50,50,150,50);
           c.add(var1);

           var2 = new JTextField();
           var2.setBounds(50,110,150,50);
           c.add(var2);

           // adding action listener to text field

            ActListen x = new ActListen();
            var1.addActionListener(x);
            var2.addActionListener(x);
//           var1.addActionListener(new ActionListener() {
//               @Override
//               public void actionPerformed(ActionEvent e) {
//                   String s = var1.getText();
//                   if(s.isEmpty()){
//                       JOptionPane.showMessageDialog(null,"You didn't enter anything");
//                   }
//                   else
//                   JOptionPane.showMessageDialog(null,"Text feild 1 = "+s);
//               }
//           });

           // adding action listener to text field 2
//        var2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String ss = var2.getText();
//                if(ss.isEmpty()){
//                    JOptionPane.showMessageDialog(null,"You didn't enter anything");
//                }
//                else
//                    JOptionPane.showMessageDialog(null,"Text feild 2 = "+ss);
//            }
//        });

    }
    class ActListen implements ActionListener{

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == var1) {
                    String s = var1.getText();
                    if (s.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "You didn't enter anything");
                    } else
                        JOptionPane.showMessageDialog(null, "Text feild 1 = " + s);
                }
                else{
                    String s = var2.getText();
                    if (s.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "You didn't enter anything");
                    } else
                        JOptionPane.showMessageDialog(null, "Text feild 2 = " + s);
                }
            }
    }
    public static void main(String[] args) {

        actionListener frame = new actionListener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,800,600);
        frame.setTitle("Action Listening.....!");
    }

}
