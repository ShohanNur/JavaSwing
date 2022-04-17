package JavaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class ComboBox extends JFrame{
     private  Container c;
     private Font f;
     private JComboBox com;
     private String[] s={"C++","Java","C","HTML","SQL"};
     private JLabel label;
     private JButton btn;
    ComboBox(){
        initcomponents();
    }
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        f = new Font("Arial",Font.BOLD+Font.ITALIC,16);
        com = new JComboBox(s);
        com.setBounds(100,100,200,50);
        com.setEditable(true);

        com.setSelectedItem("Java");
        com.addItem("C#");
        com.addItem("Laravel");
        com.removeItemAt(4);

        c.add(com);

        btn = new JButton("show");
        btn.setBounds(100,200,80,50);
        c.add(btn);

        label = new JLabel();
        label.setBounds(400,100,200,50);
        label.setFont(f);
        c.add(label);


        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = com.getSelectedItem().toString();
                label.setText("You have selected : "+s);
            }
        });
    }
    public static void main(String[] args) {
        ComboBox frame = new ComboBox();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,50,800,600);
        frame.setTitle("Combo Box !");
    }

}
