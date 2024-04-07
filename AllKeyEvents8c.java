import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AllKeyEvents8c {
public static void main(String[] args) {
JFrame frame = new JFrame("All Key Events");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JTextField textField = new JTextField(20);
textField.addKeyListener(new KeyAdapter() {
@Override
public void keyTyped(KeyEvent e) {
System.out.println("Key Typed : "+ e.getKeyChar());
}
@Override
public void keyPressed(KeyEvent e) {
System.out.println("Key Pressed : "+
KeyEvent.getKeyText(e.getKeyCode()));
}
@Override
public void keyReleased(KeyEvent e) {
System.out.println("Key Released : "+
KeyEvent.getKeyText(e.getKeyCode()));
}
});
frame.pack();
frame.add(textField);
frame.setVisible(true);
}
}