package com.example.athletemanagement.services;

import com.example.athletemanagement.models.Admin;
import java.sql.*;

public class AdminService {

    private Connection connection;

    public AdminService(Connection connection) {
        this.connection = connection;
    }

    public void cadastrarAdmin(Admin admin) throws SQLException {
        String sql = "INSERT INTO administradores (nome, email, senha) VALUES (?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, admin.getNome());
            statement.setString(2, admin.getEmail());
            statement.setString(3, admin.getSenha());
            statement.executeUpdate();
        }
    }

    public Admin buscarAdminPorEmail(String email) throws SQLException {
        String sql = "SELECT * FROM administradores WHERE email = ?";
        Admin admin = null;

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, email);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    admin = new Admin(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("email"),
                        resultSet.getString("senha")
                    );
                }
            }
        }
        return admin;
    }
}
