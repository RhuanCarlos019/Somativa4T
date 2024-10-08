package com.example.athletemanagement.views;

import javax.swing.*;
import java.awt.*;

public class AdminDashboard {
    private JFrame frame;

    public AdminDashboard() {
        frame = new JFrame("Painel do Administrador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Adicionando um painel
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Bem-vindo ao Painel do Administrador");
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
