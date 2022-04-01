package JavaSwing;

import javax.swing.*;

public class FrameDemo extends JFrame {
    public static void main(String[] args) {
        FrameDemo  frame = new FrameDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
       /* frame.setSize(1000,500);
        frame.setLocation(400 ,400);
        */
        frame.setBounds(400,200,400,400);
        frame.setTitle("HIII");
        frame.setResizable(true);
    }
}
