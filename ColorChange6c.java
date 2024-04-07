import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChange6c extends JFrame {
    private JScrollPane scrollPane = new JScrollPane();
    private JButton changeColorButton = new JButton("Change Color");

    public ColorChange6c() {
        setTitle("ScrollPane Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(changeColorButton, BorderLayout.SOUTH);
        changeColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color selectedColor = JColorChooser.showDialog(null, "Choose a Color", scrollPane.getViewport().getBackground());
                if (selectedColor != null) {
                    scrollPane.getViewport().setBackground(selectedColor);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ColorChange6c().setVisible(true);
        });
    }
}
