
import javax.swing.*;
import java.awt.*;

public class FeedPage extends JFrame {
    public FeedPage(String username) {
        setTitle("Welcome " + username);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Feed Page - Coming Soon!", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        setVisible(true);
    }
}
