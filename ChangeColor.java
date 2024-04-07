import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ChangeColor extends JFrame {
    private JPanel colorPanel;
    private JButton changeColorButton;

    public ChangeColor() {
        setTitle("Random Color Changer");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Corrected syntax for setDefaultCloseOperation
        setLayout(new BorderLayout());
        colorPanel = new JPanel(); // Corrected assignment operator
        changeColorButton = new JButton("Change Color");
        add(colorPanel, BorderLayout.CENTER);
        add(changeColorButton, BorderLayout.SOUTH);
        changeColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { // Corrected braces
                changeColor();
            }
        });
    }

    private void changeColor() { // Corrected braces
        Random random = new Random(); // Corrected instantiation
        Color randomColor = new Color(random.nextInt(256),
                                      random.nextInt(256),
                                      random.nextInt(256));
        colorPanel.setBackground(randomColor);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ChangeColor app = new ChangeColor();
            app.setVisible(true);
        });
    }
}
