import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SelectionEvents8d {
public static void main(String[] args) {
SwingUtilities.invokeLater(()-> {
JFrame frame = new JFrame("Selection Events Demo");
frame.setSize(300,200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
String[] items = {"item1","item2","item3"};
JComboBox <String> comboBox = new JComboBox<>(items);
comboBox.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
String selectedItem = (String) comboBox.getSelectedItem();
System.out.println("Selected : "+ selectedItem);
}
});
frame.add(comboBox,BorderLayout.CENTER);
frame.setVisible(true);
});
}
}