package com.example.athletemanagement.controllers;

import com.example.athletemanagement.models.Atleta;
import com.example.athletemanagement.services.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class AtletaController {
    private AtletaService atletaService;

    public AtletaController(Connection connection) {
        this.atletaService = new AtletaService(connection);
    }

    public void cadastrarAtleta(Atleta atleta) {
        atletaService.cadastrarAtleta(atleta);
    }

    public Atleta buscarAtletaPorId(int id) {
        return atletaService.buscarAtletaPorId(id);
    }

    public Atleta buscarAtletaPorEmail(String email) {
        return atletaService.buscarAtletaPorEmail(email);
    }

    public void atualizarStatusAtleta(int id, String status) {
        atletaService.atualizarStatusAtleta(id, status);
    }
}