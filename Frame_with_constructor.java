package JavaSwing;

import javax.swing.*;

public class Frame_with_constructor extends JFrame {
    Frame_with_constructor(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500,500);
        setLocation(600 ,200);
        setTitle("HIII");
        setResizable(true);
    }

    public static void main(String[] args) {
        Frame_with_constructor frame = new Frame_with_constructor();
        frame.setVisible(true);
    }
}
