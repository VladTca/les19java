import java.awt.*;
import javax.swing.*;

public class Gui {
    private JFrame frame;
    private JPanel windowContent;

    public Gui() {

        frame = new JFrame("Зоопарк");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(300, 120);

        windowContent = new JPanel();
        windowContent.setLayout(new BoxLayout(windowContent, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Добро пожаловать в зоопарк!");
        JLabel label1 = new JLabel("остальное в терминале :)");
        JButton exitButton = new JButton("Закрыть");

        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        windowContent.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));
        windowContent.add(label);
        windowContent.add(Box.createVerticalStrut(10));
        windowContent.add(label1);
        windowContent.add(Box.createVerticalStrut(20));
        windowContent.add(exitButton);

        exitButton.addActionListener(e -> System.exit(0));

        frame.setContentPane(windowContent);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
