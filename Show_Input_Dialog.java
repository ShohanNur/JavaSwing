package JavaSwing;
import javax.swing.*;
public class Show_Input_Dialog {
    public static void main(String [] args){

        String name = JOptionPane.showInputDialog(null, "Enter your first name : ","SUST-CSE",JOptionPane.QUESTION_MESSAGE );
        String last = JOptionPane.showInputDialog(null, "Enter your last name : ","SUST-CSE",JOptionPane.QUESTION_MESSAGE );
        String k = name+" "+last;
        JOptionPane.showMessageDialog(null,"Your Name is "+k,"Chodakha",JOptionPane.PLAIN_MESSAGE);
    }
}
