package JavaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MouseListener extends JFrame{
    private Container c;
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane scroll;
    MouseListener() {
        initcomponents();
    }
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        tf = new JTextField();
        tf.setBounds(20,20,150,50);
        c.add(tf);

        ta = new JTextArea();
        //ta.setBounds(10,80,300,300);
        ta.setBackground(Color.PINK);
        //c.add(ta);

        scroll = new JScrollPane(ta);
        scroll.setBounds(10,80,300,300);
        c.add(scroll);

        tf.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ta.append("Mouse Clicked\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ta.append("Mouse Pressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                ta.append("Mouse Released\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ta.append("Mouse Entered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ta.append("Mouse Exited\n");
            }
        });
    }
    public static void main(String[] args) {
        MouseListener frame = new MouseListener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,50,800,600);
        frame.setTitle("Mouse listener!");
    }
}
