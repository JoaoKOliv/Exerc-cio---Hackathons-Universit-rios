package com.mycompany.trabalho_pm;

import java.util.*;

class Equipe {
    private String nome;
    private List<Estudante> membros;

    public Equipe(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(Estudante e) {
        membros.add(e);
    }

    public String getNome() {
        return nome;
    }
}
