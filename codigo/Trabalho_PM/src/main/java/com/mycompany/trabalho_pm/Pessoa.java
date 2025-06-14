package com.mycompany.trabalho_pm;

abstract class Pessoa {
    protected String nome;
    protected String identificador;

    public Pessoa(String nome, String identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }
}
