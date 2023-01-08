import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        super("Test Arcade");
        final JFrame frame = new JFrame();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);

        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(new FlowLayout());
        Component JTable = null;
        contentPane.add(JTable);

    }
}