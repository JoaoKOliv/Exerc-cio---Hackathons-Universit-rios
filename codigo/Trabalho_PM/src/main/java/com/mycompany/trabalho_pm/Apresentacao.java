package com.mycompany.trabalho_pm;
import java.util.HashMap;
import java.util.Map;

class Apresentacao {
    private Projeto projeto;
    private Banca banca;
    private Sala sala;
    private Map <Jurado, Double> notas = new HashMap<>();

    public Apresentacao(Projeto projeto, Banca banca, Sala sala) {
        this.projeto = projeto;
        this.banca = banca;
        this.sala = sala;
    }

    public void avaliar() {
        double soma = 0;
        for(double nota : notas.values()){
            soma += nota;
        }
        
        double media = soma / notas.size();
        projeto.setNotaFinal(media);
    }
    
    public void adicionarNota(Jurado jurado, double nota){
        notas.put(jurado, nota);
    }

    public Projeto getProjeto() {
        return projeto;
    }
}
