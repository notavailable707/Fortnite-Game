import javax.swing.*;
import java.awt.*;
public class BorderLayout1 {
public static void main(String[] args) {
JFrame frame = new JFrame("Border Layout Example");
frame.setSize(300,100);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container cpane = frame.getContentPane();
cpane.setLayout(new BorderLayout());
JButton b1 = new JButton("NORTH");
JButton b2 = new JButton("SOUTH");
JButton b3 = new JButton("EAST");
JButton b4 = new JButton("WEST");
JButton b5 = new JButton("CENTER");
cpane.add(b1,BorderLayout.NORTH);
cpane.add(b2,BorderLayout.SOUTH);
cpane.add(b3,BorderLayout.EAST);
cpane.add(b4,BorderLayout.WEST);
cpane.add(b5,BorderLayout.CENTER);
frame.setVisible(true);
}
}