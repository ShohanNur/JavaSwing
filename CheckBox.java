package JavaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class CheckBox extends JFrame{
    private JCheckBox check1,check2,check3;
    private Font f;
    private Container c;
    private ButtonGroup grp;
    private JLabel label;
    CheckBox(){
        initcomponents();
    }
    public void initcomponents(){
       c = this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.CYAN);
       f = new Font("Arial",Font.BOLD+Font.ITALIC,16);
       grp = new ButtonGroup();
       check1 = new JCheckBox("Java");
       check1.setBounds(100,100,100,30);
       check1.setForeground(Color.RED);
       check1.setBackground(Color.CYAN);
       check1.setFont(f);
       c.add(check1);

        check2 = new JCheckBox("C++");
        //check2.setSelected(true); //check2 = new JCheckBox("C++",true);
        check2.setBounds(100,130,100,30);
        check2.setForeground(Color.BLACK);
        check2.setBackground(Color.CYAN);
        check2.setFont(f);
        c.add(check2);

        check3 = new JCheckBox("Python");
        check3.setBounds(100,160,100,30);
        check3.setForeground(Color.BLUE);
        check3.setBackground(Color.CYAN);
        check3.setFont(f);
        c.add(check3);
        grp.add(check1);
        grp.add(check2);
        grp.add(check3);

        label = new JLabel("You have not selected anything!");
        label.setBounds(100,200,300,30);
        label.setFont(f);
        c.add(label);

        Handler handler = new Handler();
        check2.addActionListener(handler);
        check3.addActionListener(handler);
        check1.addActionListener(handler);
    }
    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(check1.isSelected()){
                label.setText("You have selected Java");
            }
            else if(check2.isSelected()){
                label.setText("You have selected C++");
            }
            else{
                label.setText("You have selected python");
            }
        }
    }
    public static void main(String[] args) {
        CheckBox frame = new CheckBox();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,50,800,600);
        frame.setTitle("Radio Button !");
    }
}
