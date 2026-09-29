package database;
import javax.swing.*;

public class StartScreen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Type");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton managerButton = new JButton("Manager");
        JButton attendeeButton = new JButton("Attendee");

        JPanel panel = new JPanel();
        panel.add(managerButton);
        panel.add(attendeeButton);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        managerButton.addActionListener(e -> {
            frame.dispose();
            ManagerLoginScreen.showManagerLogin();
        });

        attendeeButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Attendee screen not implemented yet.");
        });
    }
}