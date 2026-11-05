import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class swingProg2 {
    public static void main(String[] args) {
        // Swing components are not thread-safe. Run them on the Event Dispatch Thread
        // (EDT).
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // 1. Create the main frame (Window)
        JFrame frame = new JFrame("My First Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // 2. Create a panel layout container
        JPanel panel = new JPanel();

        // 3. Create UI components
        JLabel label = new JLabel("Welcome to Java Swing!");
        JButton button = new JButton("Click Me");

        // 4. Add components to the panel, then the panel to the frame
        panel.add(label);
        panel.add(button);
        frame.add(panel);

        // 5. Center and display the window
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
