import javax.swing.*;
import java.awt.*;

public class DemoGrid {
	public static void main(String[] args) {
		JFrame frame= new JFrame("Grid Layout by Zaid");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350,100);

 	JPanel panel=new JPanel(new GridLayout(2,3));

		JButton b1=new JButton("Button 1");
		JButton b2=new JButton("Button 2");
		JButton b3=new JButton("Button 3");
		JButton b4=new JButton("Button 4");
		JButton b5=new JButton("Button 5");
		JButton b6=new JButton("Button 6");

		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		
		frame.add(panel);
		frame.setVisible(true);

  }

}