package JavaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MouseMotionListener extends JFrame {
    private Container c;
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane scroll;
    MouseMotionListener() {
        initcomponents();
    }
    public void initcomponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        ta = new JTextArea();
        ta.setBounds(10,20,350,350);
        c.add(ta);

        tf = new JTextField();
        tf.setBounds(390,20,200,100);
        c.add(tf);

        ta.addMouseMotionListener(new java.awt.event.MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                tf.setText("Mouse Dragged "+e.getX()+" "+e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                tf.setText("Mouse Moved "+e.getX()+" "+e.getY());
            }
        });
    }

    public static void main(String[] args) {
        MouseMotionListener frame = new MouseMotionListener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,50,800,600);
        frame.setTitle("Mouse Motion Listener!");
    }
}
