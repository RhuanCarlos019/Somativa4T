package com.example.athletemanagement.database;

import com.example.athletemanagement.models.Atleta;
import com.example.athletemanagement.database.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AtletaDAO {
    private Connection connection;

    public AtletaDAO(Connection connection) {
        this.connection = connection;
    }

    // Método para cadastrar atleta
    public void cadastrarAtleta(Atleta atleta) throws SQLException {
        String sql = "INSERT INTO atletas (nome, email, peso, idade, clube, altura, liberacao_medica, senha) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, atleta.getNome());
            stmt.setString(2, atleta.getEmail());
            stmt.setDouble(3, atleta.getPeso());
            stmt.setInt(4, atleta.getIdade());
            stmt.setString(5, atleta.getClube());
            stmt.setDouble(6, atleta.getAltura());
            stmt.setBoolean(7, atleta.isLiberacaoMedica());
            stmt.setString(8, atleta.getSenha());
            stmt.executeUpdate();
        }
    }

    // Método para listar atletas
    public List<Atleta> listarAtletas() throws SQLException {
        List<Atleta> atletas = new ArrayList<>();
        String sql = "SELECT * FROM atletas";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Atleta atleta = new Atleta();
                atleta.setId(rs.getInt("id"));
                atleta.setNome(rs.getString("nome"));
                atleta.setEmail(rs.getString("email"));
                atleta.setPeso(rs.getDouble("peso"));
                atleta.setIdade(rs.getInt("idade"));
                atleta.setClube(rs.getString("clube"));
                atleta.setAltura(rs.getDouble("altura"));
                atleta.setLiberacaoMedica(rs.getBoolean("liberacao_medica"));
                atleta.setSenha(rs.getString("senha"));
                atletas.add(atleta);
            }
        }
        return atletas;
    }

    // Método para atualizar status do atleta
    public void atualizarStatusAtleta(int id, String status) throws SQLException {
        String sql = "UPDATE atletas SET status = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, status);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        }
    }

    // Método para buscar atleta por ID
    public Atleta buscarPorId(int id) throws SQLException {
        Atleta atleta = null;
        String sql = "SELECT * FROM atletas WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    atleta = new Atleta();
                    atleta.setId(rs.getInt("id"));
                    atleta.setNome(rs.getString("nome"));
                    atleta.setEmail(rs.getString("email"));
                    atleta.setPeso(rs.getDouble("peso"));
                    atleta.setIdade(rs.getInt("idade"));
                    atleta.setClube(rs.getString("clube"));
                    atleta.setAltura(rs.getDouble("altura"));
                    atleta.setLiberacaoMedica(rs.getBoolean("liberacao_medica"));
                    atleta.setSenha(rs.getString("senha"));
                }
            }
        }
        return atleta;
    }

    // Método para buscar atleta por email
    public Atleta buscarPorEmail(String email) throws SQLException {
        Atleta atleta = null;
        String sql = "SELECT * FROM atletas WHERE email = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, email);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    atleta = new Atleta();
                    atleta.setId(rs.getInt("id"));
                    atleta.setNome(rs.getString("nome"));
                    atleta.setEmail(rs.getString("email"));
                    atleta.setPeso(rs.getDouble("peso"));
                    atleta.setIdade(rs.getInt("idade"));
                    atleta.setClube(rs.getString("clube"));
                    atleta.setAltura(rs.getDouble("altura"));
                    atleta.setLiberacaoMedica(rs.getBoolean("liberacao_medica"));
                    atleta.setSenha(rs.getString("senha"));
                }
            }
        }
        return atleta;
    }
}