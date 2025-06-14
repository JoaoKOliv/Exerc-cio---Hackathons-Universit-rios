package com.mycompany.trabalho_pm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Banca {
    private List<Jurado> jurados;
    private Map<Jurado, Double> notas;

    public Banca(List<Jurado> jurados) {
        this.jurados = jurados;
        this.notas = new HashMap<>();
        for (Jurado j : jurados) {
            notas.put(j, Math.random() * 5 + 5); // Nota entre 5 e 10
        }
    }

    public double calcularNotaFinal() {
        return notas.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }
}

