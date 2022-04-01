package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginFrame extends JFrame {
    private JLabel userLabel,passLabel;
    private JTextField text;
    private JPasswordField password;
    private JButton LoginButton, clearButton;
    private Container c;
    private Font f;
    private Cursor cursor1,cursor2;
    LoginFrame(){
        initcomponents();
    }
    public void initcomponents(){
       c = this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.yellow);

       //  write text in the frame :
       f = new Font("Arial",Font.ITALIC,16);
       userLabel = new JLabel("username : ");
       userLabel.setBounds(50,50,150,50);
       userLabel.setFont(f);
       c.add(userLabel);

       // text field in the frame
       text = new JTextField();
       text.setFont(f);
       text.setBounds(170,50,200,50);
       c.add(text);

       // text in the frame
        passLabel = new JLabel("Password : ");
        passLabel.setBounds(50,150,150,50);
        passLabel.setFont(f);
        c.add(passLabel);

        // password field in the frame
        password  = new JPasswordField();
        password.setEchoChar('*');
        password.setFont(f);
        password.setBounds(170,150,200,50);
        c.add(password);

        // Action listener in the text field
        text.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   String s = text.getText();
                   if(s.isEmpty()){
                       JOptionPane.showMessageDialog(null,"You didn't enter anything");
                   }
                   else
                   JOptionPane.showMessageDialog(null,"Text feild 1 = "+s);
               }
           });

          // Action listener in the password field---------
        password.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   String s = password.getText();
                   if(s.isEmpty()){
                       JOptionPane.showMessageDialog(null,"No password is entered");
                   }
                   else
                   JOptionPane.showMessageDialog(null,"Password is entered");
               }
           });

        // Login button in the frame
        cursor1 = new Cursor(Cursor.HAND_CURSOR);
        LoginButton = new JButton("Login");
        LoginButton.setBounds(150,230,150,50);
        LoginButton.setFont(f);
        LoginButton.setCursor(cursor1);
        c.add(LoginButton);

        // clear button in the frame
        cursor2 = new Cursor(Cursor.CROSSHAIR_CURSOR);
        clearButton = new JButton("Clear");
        clearButton.setBounds(340,230,150,50);
        clearButton.setFont(f);
        clearButton.setCursor(cursor2);
        c.add(clearButton);

        // Action listener in the login button
        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = text.getText();
                String ss = password.getText();
                if(s.equals("Shohan") && ss.equals("123")){
                    JOptionPane.showMessageDialog(null,"Welcome!");
                    //dispose();
                    NewLoginFrame frr = new NewLoginFrame();
                    frr.setVisible(true);

                    frr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frr.setBounds(100,50,800,600);
                    frr.setTitle("Login Frame.....!");
                }
                else
                    JOptionPane.showMessageDialog(null,"Something is wrong!");
            }
        });
         // Action listener in the clear  button
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
                password.setText("");
            }
        });



    }
    public static void main(String[] args) {
        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,800,600);
        frame.setTitle("Login Frame.....!");
    }
}
