package JavaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class CountingVowel extends JFrame {
    private  Container c;
    private Font f;
    private JLabel l1,vowelLabel,vowelA,vowelE,vowelI,vowelO,vowelU;
    private JTextArea ta;
    private JScrollPane scroll;
    int totalVowel = 0;
    int letterA = 0;
    int letterE = 0;
    int letterI = 0;
    int letterO = 0;
    int letterU = 0;
    CountingVowel(){
        initcomponents();
    }
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        l1 = new JLabel("Enter your text: ");
        l1.setBounds(10,20,150,50);
        c.add(l1);

        ta = new JTextArea();
//        ta.setBounds(200,70,300,100);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        scroll = new JScrollPane(ta);
        scroll.setBounds(110,20,450,100);
        c.add(scroll);

        vowelLabel = new JLabel("Count Vowel:");
        vowelLabel.setBounds(110,150,150,30);
        c.add(vowelLabel);

        vowelA = new JLabel("A occurs:");
        vowelA.setBounds(110,190,150,30);
        c.add(vowelA);

        vowelE = new JLabel("E occurs:");
        vowelE.setBounds(110,240,150,30);
        c.add(vowelE);

        vowelI = new JLabel("I occurs:");
        vowelI.setBounds(110,290,150,30);
        c.add(vowelI);

        vowelO = new JLabel("O occurs:");
        vowelO.setBounds(110,340,150,30);
        c.add(vowelO);

        vowelU = new JLabel("U occurs:");
        vowelU.setBounds(110,390,150,30);
        c.add(vowelU);

        ta.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                 if(e.getSource() == ta){
                     if(e.VK_A == e.getKeyCode()){
                         letterA++;
                         totalVowel++;
                     }
                     else if(e.VK_E == e.getKeyCode()){
                         letterE++;
                         totalVowel++;
                     }
                     else if(e.VK_I == e.getKeyCode()){
                         letterI++;
                         totalVowel++;
                     }
                     else if(e.VK_O == e.getKeyCode()){
                         letterO++;
                         totalVowel++;
                     }
                     else if(e.VK_U == e.getKeyCode()){
                         letterU++;
                         totalVowel++;
                     }
                 }
                 vowelLabel.setText("Total number of vowels: "+totalVowel);
                 vowelA.setText("Total number of A :"+letterA);
                 vowelE.setText("Total number of E :"+letterE);
                 vowelI.setText("Total number of I :"+letterI);
                 vowelO.setText("Total number of O :"+letterO);
                 vowelU.setText("Total number of U :"+letterU);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        CountingVowel frame = new CountingVowel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,50,800,600);
        frame.setTitle("Vowel Counting App !");
    }

}
