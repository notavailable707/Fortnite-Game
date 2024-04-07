import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MenuItemClk8a_2 {
public static void main(String[] args) {
JFrame frame = new JFrame("Menu ItemClick Demo");
frame.setSize(400,300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JMenuBar menuBar = new JMenuBar();
JMenu fileMenu = new JMenu("File");
JMenuItem openItem = new JMenuItem("Open");
openItem.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(frame,"File -> Openclicked!");
}
});
fileMenu.add(openItem);
menuBar.add(fileMenu);
frame.add(menuBar);
frame.setVisible(true);
}
}