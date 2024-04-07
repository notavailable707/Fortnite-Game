import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AllFocusEvents8e {
public static void main(String[] args) {
SwingUtilities.invokeLater(()-> {
JFrame frame = new JFrame("Focus Events Demo");
frame.setSize(300,200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JTextField textField = new JTextField(20);
textField.addFocusListener(new FocusListener() {
@Override
public void focusGained(FocusEvent e) {
System.out.println("Focus gained on text field");
}
@Override
public void focusLost(FocusEvent e) {
System.out.println("Focus lost on text field");
}
});
JPanel panel = new JPanel();
panel.add(textField);
frame.add(panel);
frame.setVisible(true);
});
}
}