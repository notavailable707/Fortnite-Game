import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ShowFileInTextArea6b extends JFrame {
private JTextArea textArea = new JTextArea(20,40);
private JButton openFileButton = new JButton("OpenFile");
public ShowFileInTextArea6b() {
setTitle("File Viewer");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new BorderLayout());
JScrollPane scrollPane = new JScrollPane(textArea);
add(scrollPane,BorderLayout.CENTER);
add(openFileButton,BorderLayout.SOUTH);
openFileButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
openFile();
}
});
pack();
setLocationRelativeTo(null);
}
private void openFile() {
JFileChooser fileChooser = new JFileChooser();
int result = fileChooser.showOpenDialog(this);
if (result == JFileChooser.APPROVE_OPTION) {
try(BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
StringBuilder content = new StringBuilder();
String line;
while((line = reader.readLine()) != null) {
content.append(line).append("\n");
}
textArea.setLineWrap(true);
textArea.setText(content.toString());
}
catch(IOException e) {
JOptionPane.showMessageDialog(this,"Error reading thefile.","Error",JOptionPane.ERROR_MESSAGE);
}
}
}
public static void main(String[] args) {
SwingUtilities.invokeLater(()-> {
new ShowFileInTextArea6b().setVisible(true);
});
}
}