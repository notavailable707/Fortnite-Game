import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AllMouseEvents8b {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("MouseClick Event Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            JLabel label = new JLabel();
            panel.add(label);
            panel.setPreferredSize(new Dimension(300, 200));
            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    JOptionPane.showMessageDialog(frame, "Mouse Clicked at (" + e.getX() + "," + e.getY() + ")");
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    frame.setTitle("Mouse Entered");
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    frame.setTitle("Mouse Exited");
                }
            });
            panel.addMouseMotionListener(new MouseAdapter() {
                @Override
                public void mouseMoved(MouseEvent e) {
                    label.setText("Mouse moved at (" + e.getX() + "," + e.getY() + ")");
                }
            });
            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
