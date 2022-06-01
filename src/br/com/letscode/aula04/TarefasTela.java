package br.com.letscode.aula04;

import br.com.letscode.aula03.Prioridade;
import br.com.letscode.aula03.Tarefa;

import java.util.Scanner;

public class TarefasTela {
    public MenuPrincipal exibirMenu() {
        do {
            System.out.println("Informe a opção desejada:");
            System.out.println("A - Adicionar");
            System.out.println("E - Excluir");
            System.out.println("L - Listar");
            System.out.println("X - Sair");

            String opcao = new Scanner(System.in).nextLine();
            switch (opcao) {
                case "A":
                case "a":
                    return MenuPrincipal.ADICIONAR;
                case "E":
                case "e":
                    return MenuPrincipal.REMOVER;
                case "L":
                case "l":
                    return MenuPrincipal.LISTAR;
                case "X":
                case "x":
                    return MenuPrincipal.SAIR;
                default:
                    System.out.println("Opção inválida! Tente novamente!");
            }
        } while (true);
    }

    public Tarefa solicitarTarefa(int novoId) {
        String titulo = solicitarDado("Insira o título da tarefa");
        Tarefa novaTarefa = new Tarefa(novoId, titulo);

        System.out.println("Informe a prioridade da tarefa:");
        for (int i = 0; i < Prioridade.values().length; i++) {
            System.out.printf("%d - %s%n", i + 1, Prioridade.values()[i].name());
        }
        Prioridade prioridade = null;
        do {
            int opcao = new Scanner(System.in).nextInt();
            for (int i = 0; i < Prioridade.values().length; i++) {
                if (opcao == i + 1) {
                    prioridade = Prioridade.values()[i];
                }
            }
        } while (prioridade == null);
        novaTarefa.setPrioridade(prioridade);

        return novaTarefa;
    }

    private String solicitarDado(String pergunta) {
        System.out.println(pergunta);
        String dado = new Scanner(System.in).nextLine();
        return dado;
    }

    public Tarefa localizarTarefa(Tarefa[] tarefas) {
        String titulo = solicitarDado("Informe o título da tarefa");
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getTitulo().equalsIgnoreCase(titulo)) {
                return tarefa;
            }
        }
        return null;
    }

    public void listarTarefas(Tarefa[] tarefas) {
        System.out.println("Tarefa   - Prioridade - %");
    }
}
