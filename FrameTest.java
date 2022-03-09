import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameTest extends JFrame {
    JPanel panel;
    JButton button;

    public FrameTest() {
        super("A JFrame");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        Dimension dim = new Dimension(300, 300);

        panel = new JPanel();
        panel.setPreferredSize(dim);
        panel.setLayout(new GridBagLayout());

        Border blackline = BorderFactory.createLineBorder(Color.black);
        panel.setBorder(blackline);

        button = new JButton("Press Me");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Your first Swing App.");
            }
        }); // can also be done using a lambda expression

        panel.add(button);

        add(panel);
    }

    public static void main(String[] args) {
        FrameTest frame = new FrameTest();
        frame.setVisible(true);
    }
}
