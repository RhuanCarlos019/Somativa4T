package com.example.athletemanagement.services;

import com.example.athletemanagement.database.AtletaDAO;
import com.example.athletemanagement.models.Atleta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AtletaService {
    private AtletaDAO atletaDAO;

    public AtletaService(Connection connection) {
        this.atletaDAO = new AtletaDAO(connection);
    }

    // Método para cadastrar atleta
    public void cadastrarAtleta(Atleta atleta) {
        try {
            atletaDAO.cadastrarAtleta(atleta);
            System.out.println("Atleta cadastrado com sucesso.");
        } catch (Exception e) {
            System.err.println("Erro ao cadastrar atleta: " + e.getMessage());
        }
    }

    // Método para listar todos os atletas
    public List<Atleta> listarAtletas() {
        List<Atleta> atletas = null;
        try {
            atletas = atletaDAO.listarAtletas();
        } catch (Exception e) {
            System.err.println("Erro ao listar atletas: " + e.getMessage());
        }
        return atletas;
    }

    // Método para atualizar status do atleta
    public void atualizarStatusAtleta(int id, String status) {
        try {
            atletaDAO.atualizarStatusAtleta(id, status);
            System.out.println("Status do atleta atualizado com sucesso.");
        } catch (Exception e) {
            System.err.println("Erro ao atualizar status do atleta: " + e.getMessage());
        }
    }

    // Método para buscar atleta por ID
    public Atleta buscarAtletaPorId(int id) {
        Atleta atleta = null;
        try {
            atleta = atletaDAO.buscarPorId(id);
        } catch (Exception e) {
            System.err.println("Erro ao buscar atleta por ID: " + e.getMessage());
        }
        return atleta;
    }

    // Método para buscar atleta por email
    public Atleta buscarAtletaPorEmail(String email) {
        Atleta atleta = null;
        try {
            atleta = atletaDAO.buscarPorEmail(email);
        } catch (Exception e) {
            System.err.println("Erro ao buscar atleta por email: " + e.getMessage());
        }
        return atleta;
    }
}