package com.example.athletemanagement.models;

public class Atleta {
    private int id;
    private String nome;
    private String email;
    private double peso;
    private int idade;
    private String clube;
    private double altura;
    private boolean liberacaoMedica;
    private String senha;

    // Construtor padrão
    public Atleta() {
    }

    // Construtor com parâmetros
    public Atleta(int id, String nome, String email, double peso, int idade, String clube, double altura, boolean liberacaoMedica, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.peso = peso;
        this.idade = idade;
        this.clube = clube;
        this.altura = altura;
        this.liberacaoMedica = liberacaoMedica;
        this.senha = senha;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isLiberacaoMedica() {
        return liberacaoMedica;
    }

    public void setLiberacaoMedica(boolean liberacaoMedica) {
        this.liberacaoMedica = liberacaoMedica;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}