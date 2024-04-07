import javax.swing.*;
import java.awt.*;

public class DemoFlowLayout {
	public static void main(String[] args) {
		JFrame frame=new JFrame("Sample Window");
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,100);


		JPanel panel=new JPanel(new FlowLayout(FlowLayout.RIGHT)); 


		JButton b1=new JButton("Button 1");
		JButton b2=new JButton("Button 2");
		JButton b3=new JButton("Button 3");
		

		panel.add(b1);
		panel.add(b2);
		panel.add(b3);

		frame.add(panel);
		frame.setVisible(true);
   }

}