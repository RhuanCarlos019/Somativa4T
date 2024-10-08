package com.example.athletemanagement.views;

import javax.swing.*;
import java.awt.*;

public class AthleteDashboard {
    private JFrame frame;

    public AthleteDashboard() {
        frame = new JFrame("Painel do Atleta");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Adicionando um painel
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Bem-vindo ao Painel do Atleta");
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
