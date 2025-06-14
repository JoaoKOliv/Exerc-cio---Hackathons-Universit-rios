package com.mycompany.trabalho_pm;

import java.util.*;

public class Trabalho_PM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Equipes equipes = Equipes.getInstancia();
        Apresentacoes apresentacoes = Apresentacoes.getInstancia();

        for (int eq = 1; eq <= 2; eq++) {
            System.out.println("=== Cadastro da Equipe " + eq + " ===");
            System.out.print("Nome da equipe: ");
            String nomeEquipe = sc.nextLine();
            Equipe equipe = new Equipe(nomeEquipe);

            for (int i = 1; i <= 5; i++) {
                System.out.print("Nome do aluno " + i + ": ");
                String nomeAluno = sc.nextLine();
                System.out.print("ID do aluno " + i + ": ");
                String idAluno = sc.nextLine();
                equipe.adicionarMembro(new Estudante(nomeAluno, idAluno));
            }
            equipes.adicionar(equipe);

            System.out.print("Titulo do projeto da equipe: ");
            String tituloProjeto = sc.nextLine();
            System.out.print("Nome do orientador: ");
            String nomeOrientador = sc.nextLine();
            System.out.print("ID do orientador: ");
            String idOrientador = sc.nextLine();

            Projeto projeto = new Projeto(tituloProjeto, equipe, new Profissional(nomeOrientador, idOrientador));

            List<Jurado> jurados = new ArrayList<>();
            System.out.println("=== Cadastro dos 4 jurados ===");
            for (int j = 1; j <= 4; j++) {
                System.out.print("Nome do jurado " + j + ": ");
                String nomeJ = sc.nextLine();
                System.out.print("ID do jurado " + j + ": ");
                String idJ = sc.nextLine();
                jurados.add(new Jurado(nomeJ, idJ));
            }

            Banca banca = new Banca(jurados);
            System.out.print("Numero da sala: ");
            String numeroSala = sc.nextLine();
            Sala sala = new Sala(numeroSala);
            Apresentacao ap = new Apresentacao(projeto, banca, sala);

            System.out.println("=== Atribuicao das notas dos jurados ===");
            for (Jurado jurado : jurados) {
                System.out.print("Nota do jurado " + jurado.nome + ": ");
                double nota = sc.nextDouble();
                ap.adicionarNota(jurado, nota);
            }
            sc.nextLine();

            ap.avaliar();
            apresentacoes.adicionar(ap);
        }

        System.out.println("\n=== Projetos Aprovados (Nota ≥ 7.0) ===");
        apresentacoes.getAprovadas().forEach(ap -> System.out.println(ap.getProjeto()));

        sc.close();
    }
}
