package com.example.athletemanagement.database;

import com.example.athletemanagement.models.Admin;
import com.example.athletemanagement.database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAO {

    private Connection connection;

    public AdminDAO() {
        this.connection = DatabaseConnection.getConnection();
    }

    // Método para verificar o login de administrador
    public Admin login(String email, String senha) throws SQLException {
        Admin admin = null;
        String sql = "SELECT * FROM administradores WHERE email = ? AND senha = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, email);
            stmt.setString(2, senha);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    admin = new Admin();
                    admin.setId(rs.getInt("id"));
                    admin.setNome(rs.getString("nome"));
                    admin.setEmail(rs.getString("email"));
                    admin.setSenha(rs.getString("senha"));
                }
            }
        }

        return admin;
    }
}