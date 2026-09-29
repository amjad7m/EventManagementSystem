package database;
import javax.swing.*;
import java.awt.*;

public class ManagerDashboard {
    public static void showDashboard(String managerId) {
        JFrame frame = new JFrame("Manager Dashboard");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 1, 10, 10));

        JLabel welcomeLabel = new JLabel("Welcome, Manager!", JLabel.CENTER);
        frame.add(welcomeLabel);

        JButton infoButton = new JButton("Manager Info");
        JButton eventButton = new JButton("Events");
        JButton participantsButton = new JButton("Participants");

        frame.add(infoButton);
        frame.add(eventButton);
        frame.add(participantsButton);

        infoButton.addActionListener(e -> {
            frame.dispose();
            ManagerInfoScreen.showManagerInfo(managerId);
        });

        eventButton.addActionListener(e -> {
            frame.dispose();
            EventScreen.showEventScreen();
        });

        participantsButton.addActionListener(e -> {
            frame.dispose();
            ParticipantScreen.showParticipantScreen();
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}