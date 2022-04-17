package JavaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class FocusListener extends JFrame{
    private Container c;
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane scroll;
    FocusListener() {
        initcomponents();
    }
    public void initcomponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        ta = new JTextArea();
        ta.setBounds(10, 20, 350, 350);
        c.add(ta);

        tf = new JTextField();
        tf.setBounds(390, 20, 200, 100);
        c.add(tf);

        ta.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                tf.setText("Focus Gained");
            }

            @Override
            public void focusLost(FocusEvent e) {
                tf.setText("Focus Lost");
            }
        });
    }
        public static void main(String[] args) {
        FocusListener frame = new FocusListener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,50,800,600);
        frame.setTitle("Focus Listener!");
    }
}
