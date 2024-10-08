package com.example.athletemanagement.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterView {
    private JFrame frame;
    private JTextField nomeField;
    private JTextField emailField;
    private JTextField pesoField;
    private JTextField idadeField;
    private JTextField clubeField;
    private JTextField alturaField;
    private JCheckBox liberacaoMedicaBox;
    private JPasswordField senhaField;

    public RegisterView() {
        frame = new JFrame("Cadastro de Atleta");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(9, 2));

        // Componentes
        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        JLabel pesoLabel = new JLabel("Peso:");
        pesoField = new JTextField();
        JLabel idadeLabel = new JLabel("Idade:");
        idadeField = new JTextField();
        JLabel clubeLabel = new JLabel("Clube:");
        clubeField = new JTextField();
        JLabel alturaLabel = new JLabel("Altura:");
        alturaField = new JTextField();
        JLabel liberacaoMedicaLabel = new JLabel("Liberação Médica:");
        liberacaoMedicaBox = new JCheckBox();
        JLabel senhaLabel = new JLabel("Senha:");
        senhaField = new JPasswordField();
        JButton registerButton = new JButton("Registrar");

        // Adicionando os componentes ao frame
        frame.add(nomeLabel);
        frame.add(nomeField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(pesoLabel);
        frame.add(pesoField);
        frame.add(idadeLabel);
        frame.add(idadeField);
        frame.add(clubeLabel);
        frame.add(clubeField);
        frame.add(alturaLabel);
        frame.add(alturaField);
        frame.add(liberacaoMedicaLabel);
        frame.add(liberacaoMedicaBox);
        frame.add(senhaLabel);
        frame.add(senhaField);
        frame.add(registerButton);

        // Ação do botão de registro
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar a lógica de registro aqui
            }
        });

        frame.setVisible(true);
    }
}
