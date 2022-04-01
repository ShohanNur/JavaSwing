package JavaSwing;

import javax.swing.*;

public class Show_Confirm_Dialog {
    public static void main(String[] args) {
        int x = JOptionPane.showConfirmDialog(null,"Do you want to quit ?","Suicide Game",JOptionPane.OK_CANCEL_OPTION);
//        if(x == JOptionPane.YES_OPTION|| x == JOptionPane.CANCEL_OPTION){
//            System.exit(0);
//        }
//        else {
//            System.out.println("NOOOOOOOOOOOOOOOOOOOOOOOOO");
//        }
    }
}
