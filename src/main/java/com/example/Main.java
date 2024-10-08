package com.example;

import com.example.athletemanagement.database.DatabaseConnection;
import com.example.athletemanagement.views.AthleteDashboard;
import com.example.athletemanagement.views.LoginView;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        // Estabelecendo a conexão com o banco de dados
        Connection connection = DatabaseConnection.getConnection();

        // Inicializando a tela de login
        if (connection != null) {
            new AthleteDashboard ();
        } else {
            System.err.println("Não foi possível iniciar a aplicação devido a problemas na conexão com o banco de dados.");
        }
    }
}
