package com.mycompany.trabalho_pm;

class Projeto {
    private String titulo;
    private Equipe equipe;
    private Profissional orientador;
    private double notaFinal;

    public Projeto(String titulo, Equipe equipe, Profissional orientador) {
        this.titulo = titulo;
        this.equipe = equipe;
        this.orientador = orientador;
        this.notaFinal = 0.0;
    }

    public void setNotaFinal(double nota) {
        this.notaFinal = nota;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public String getTitulo() {
        return titulo;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public Profissional getOrientador() {
        return orientador;
    }

    @Override
    public String toString() {
        return "Projeto: " + titulo +
               ", Equipe: " + equipe.getNome() +
               ", Orientador: " + orientador.nome +
               ", Nota Final: " + notaFinal;
    }
}
