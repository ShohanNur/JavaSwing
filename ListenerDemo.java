package JavaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class ListenerDemo extends JFrame implements ActionListener {
    private Container c;
    private Font f;
    private JButton b1,b2,b3;
    ListenerDemo() {
        initcomponents();
    }
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        f = new Font("Arial",Font.BOLD+Font.ITALIC,16);

        b1 = new JButton("RED");
        b1.setBounds(100,100,100,50);
        b1.setBackground(Color.RED);
        c.add(b1);

        b2 = new JButton("GREEN");
        b2.setBounds(100,170,100,50);
        b2.setBackground(Color.GREEN);
        c.add(b2);

        b3 = new JButton("BLUE");
        b3.setBounds(100,250,100,50);
        b3.setBackground(Color.BLUE);
        c.add(b3);

        // manual procedure :
     /*   b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.RED);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.GREEN);
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.BLUE);
            }
        });

      */
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public static void main(String[] args) {
        ListenerDemo frame = new ListenerDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,50,800,600);
        frame.setTitle("Listener Demo !");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            c.setBackground(Color.RED);
        }
        else if(e.getSource()==b2){
            c.setBackground(Color.GREEN);
        }
        else{
            c.setBackground(Color.BLUE);
        }
    }
}
