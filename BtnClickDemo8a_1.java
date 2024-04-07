import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnClickDemo8a_1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Button Click Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cpane = frame.getContentPane();
		JButton b1 = new JButton("Click Here");
		b1.addActionListener(new ActionListener() {

	@Override
	        public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(frame,"Button Clicked!");
}
});

cpane.add(b1);
frame.pack();
frame.setVisible(true);
}
}
