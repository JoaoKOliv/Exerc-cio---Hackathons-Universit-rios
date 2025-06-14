package com.mycompany.trabalho_pm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Apresentacoes {
    private static Apresentacoes instancia;
    private List<Apresentacao> lista = new ArrayList<>();

    private Apresentacoes() {}

    public static Apresentacoes getInstancia() {
        if (instancia == null) instancia = new Apresentacoes();
        return instancia;
    }

    public void adicionar(Apresentacao a) {
        lista.add(a);
    }

    public List<Apresentacao> getAprovadas() {
        return lista.stream().filter(a -> a.getProjeto().getNotaFinal() >= 7).collect(Collectors.toList());
    }
}
