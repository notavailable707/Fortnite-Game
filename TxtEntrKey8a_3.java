import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TxtEntrKey8a_3 {
public static void main(String[] args) {
JFrame frame = new JFrame("Text Field Enter Key Demo");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JTextField textField = new JTextField(20);
textField.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(frame,"EnterKeypressed in text field");
}
});
frame.getContentPane().add(textField);
frame.pack();
frame.setVisible(true);
}
}