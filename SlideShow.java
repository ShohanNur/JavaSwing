package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.PrimitiveIterator;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class SlideShow extends  JFrame implements ActionListener{
    private Container c;
    private JPanel panel;
    private JButton bt1,bt2;
    private Font f;
    private JLabel label;
    private ImageIcon icon;
    private CardLayout card;
    SlideShow(){
        initcomponents();
        showImage();
    }
    public void showImage(){
        String[] imageNames = {"pic1.jpg","pic2.jpg","pic3.jpg","pic5.jpg","pic6.jpg","pic7.jpg"};
        for(String s:imageNames){
            icon = new ImageIcon("src/JavaSwing/image/"+s);
            // resizing the image

            Image img = icon.getImage();
            Image newImg = img.getScaledInstance(panel.getWidth(),panel.getHeight(),Image.SCALE_SMOOTH);
            icon = new ImageIcon(newImg);
            label = new JLabel(icon);
            panel.add(label);
        }
    }
    public void initcomponents(){
        c = this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);

        card = new CardLayout();
        panel = new JPanel(card);
        panel.setBounds(20,20,750,400);
        panel.setBackground(Color.GREEN);
        c.add(panel);

        f = new Font("Arial",Font.BOLD,20);
        bt1 = new JButton("Previous");
        bt1.setBounds(20,450,150,100);
       // bt1.setBackground(Color.RED);
        bt1.setFont(f);
        c.add(bt1);

        bt2 = new JButton("Next");
        bt2.setBounds(620,450,150,100);
      //  bt2.setBackground(Color.RED);
        bt2.setFont(f);
        c.add(bt2);

        bt1.addActionListener(this);
        bt2.addActionListener(this);

    }
    public static void main(String[] args) {
        SlideShow frame = new SlideShow();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,800,600);
        frame.setTitle("Slide Show Project");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource()==bt1){
              card.previous(panel);
          }
          else {
              card.next(panel);
          }
    }
}
