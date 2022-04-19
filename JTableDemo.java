package JavaSwing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.util.PrimitiveIterator;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
public class JTableDemo extends JFrame {
    private Container c;
    private JLabel label;
    private Font f;
    private JTable table;
    private String[] cols = {"Reg No","Name","CGPA","District"};
    private String[][] rows = {
            { "2019331042","Md.Shohanur Rahman","3.79","Dinajpur"},
            {"2019331114","Md.Istiak","3.84","Barishal"},
            {"2019331102","Md.Kamrul Islam","3.33","Faridpur"},
            {"2019331043","Zakaria Sarker","3.77","Sirajgonj"},
            {"2019331112","Md.Selim","3.34","Dinajpur"},
            {"2019331002","Mainul Islam","3.96","Tangail"},
            {"2019331054","Syed Sazid Hossain Rezvi","3.54","Tangail"},
            {"2019331041","Radif Tazwar","3.77","Dhaka"},
            {"2019331076","Shibli Noman Sunny","3.84","Bhairav"}
                             };
    private JScrollPane scroll;
    JTableDemo(){
        initcomponents();
    }
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        f = new Font("Arial",Font.BOLD,22);

        label = new JLabel("Student Details");
        label.setBounds(300,20,250,100);
        label.setFont(f);
        c.add(label);

        table = new JTable(rows,cols);
        table.setSelectionBackground(Color.PINK);
        //table.setEnabled(false);
        scroll = new JScrollPane(table);
        scroll.setBounds(50,80,600,150);
        c.add(scroll);
    }
    public static void main(String[] args) {
        JTableDemo frame = new JTableDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,800,600);
        frame.setTitle("JTable Demo!");
    }
}
