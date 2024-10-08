package com.example.athletemanagement.views;

import com.example.athletemanagement.controllers.AdminController;
import com.example.athletemanagement.controllers.AtletaController;
import com.example.athletemanagement.models.Admin;
import com.example.athletemanagement.models.Atleta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class LoginView extends JFrame {
    private Connection connection;
    private AtletaController atletaController;

    public LoginView(Connection connection) {
        this.connection = connection;
        this.atletaController = new AtletaController(connection);

        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Criando componentes da interface
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        placeComponents(panel);
        
        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Email:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Senha:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 50, 165, 25);
        panel.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = userText.getText();
                String senha = new String(passwordField.getPassword());
                // Aqui você pode adicionar a lógica de verificação
                Atleta atleta = atletaController.buscarAtletaPorEmail(email);
                if (atleta != null && atleta.getSenha().equals(senha)) {
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                    // Adicione a lógica para abrir a próxima tela
                } else {
                    JOptionPane.showMessageDialog(null, "Email ou senha inválidos.");
                }
            }
        });
    }
}
