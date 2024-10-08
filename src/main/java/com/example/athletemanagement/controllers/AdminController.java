package com.example.athletemanagement.controllers;

import com.example.athletemanagement.models.Admin;
import com.example.athletemanagement.services.AdminService;

import java.sql.Connection;
import java.sql.SQLException;

public class AdminController {
    private AdminService adminService;

    public AdminController(Connection connection) {
        this.adminService = new AdminService(connection);
    }

    public void cadastrarAdmin(Admin admin) {
        try {
            adminService.cadastrarAdmin(admin);
            System.out.println("Administrador cadastrado com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar administrador: " + e.getMessage());
        }
    }

    public Admin buscarAdminPorEmail(String email) {
        try {
            return adminService.buscarAdminPorEmail(email);
        } catch (SQLException e) {
            System.err.println("Erro ao buscar administrador: " + e.getMessage());
            return null;
        }
    }
}
