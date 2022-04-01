package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class ImageAdd_JLabel extends JFrame {
    private ImageIcon icon,img1,img2;
    private Container c;
    private JLabel userLabel,passLabel,imgLable,imgLable1;
    private Font f;
    ImageAdd_JLabel(){
        initComponents();
    }
    public void initComponents(){
        // change icon of the frame
        icon = new ImageIcon (getClass().getResource("picc.jpg"));
        this.setIconImage(icon.getImage());
        // change background color of the frame
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        // set fond style and font size
        f = new Font("Arial",Font.BOLD,19);
        // add image on JLabel
        img1 = new ImageIcon(getClass().getResource("xx.jpeg"));
        //img2 = new ImageIcon(getClass().getResource("levi.ackerman.jpg"));
        imgLable = new JLabel(img1);
        //imgLable = new JLabel(img2);
        //imgLable.setBounds(50,30,100,150);
        imgLable.setBounds(50,30,img1.getIconWidth(),img1.getIconHeight());
        //imgLable.setBounds(100,100,img2.getIconWidth(),img2.getIconHeight());
        c.add(imgLable);

        img2 = new ImageIcon(getClass().getResource("levi.ackerman.jpg"));
        imgLable1 = new JLabel(img2);
        imgLable1.setBounds(650,30,img2.getIconWidth(),img2.getIconHeight());
        c.add(imgLable1);
        // using JLabel to set set text in the frame
//        userLabel = new JLabel();
//        userLabel.setText("Enter your user Name : ");
//       // System.out.println(userLabel.getText());
//        userLabel.setBounds(50,20,250,50);
//        userLabel.setFont(f); // set font
//        userLabel.setForeground(Color.RED);//set text color
//        userLabel.setOpaque(true); // First we have to enable it to set background
//        userLabel.setBackground(Color.BLUE); // set back ground of the text
//        userLabel.setToolTipText("Hey there you are beautiful !");
        //  System.out.println(userLabel.getToolTipText());
        // c.add(userLabel);
        // using JLabel to set text in the frame
//        passLabel = new JLabel("Enter your password");
//        passLabel.setBounds(50,80,200,50);
//        passLabel.setFont(f);  // font
//        c.add(passLabel);
    }
    public static void main(String[] args) {
        ImageAdd_JLabel frame = new ImageAdd_JLabel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,1200,800);
        frame.setTitle("Label Demo");
        frame.setResizable(true);
    }
}
