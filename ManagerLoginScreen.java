package database;
import javax.swing.*;
import java.awt.*;

public class ManagerLoginScreen {
    public static void showManagerLogin() {
        JFrame frame = new JFrame("Manager Login");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 1));

        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();

        frame.add(new JLabel("Manager ID:"));
        frame.add(idField);
        frame.add(new JLabel("Manager Name:"));
        frame.add(nameField);

        JButton continueButton = new JButton("Continue");
        frame.add(continueButton);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        continueButton.addActionListener(e -> {
            String id = idField.getText();
            String name = nameField.getText();
            JOptionPane.showMessageDialog(null, "Welcome, " + name);
            frame.dispose();
            ManagerDashboard.showDashboard(id);
        });
    }
}