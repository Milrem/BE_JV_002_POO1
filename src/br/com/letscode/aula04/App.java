package br.com.letscode.aula04;

import br.com.letscode.aula03.Tarefa;
import br.com.letscode.aula03.TarefasList;

public class App {
    public static void main(String[] args) {
        TarefasList listaTarefas = new TarefasList();

        TarefasTela tela = new TarefasTela();
        MenuPrincipal opcaoMenu;
        do {
            opcaoMenu = tela.exibirMenu();
            switch (opcaoMenu) {
                case ADICIONAR:
                    Tarefa tarefa = tela.solicitarTarefa(listaTarefas.getTotal() + 1);
                    System.out.println(tarefa.getId());
                    System.out.println(tarefa.getTitulo());
                    listaTarefas.adicionar(tarefa);
                    break;
                case REMOVER:
                    Tarefa tarefaRemover = tela.localizarTarefa(listaTarefas.listar());
                    if (tarefaRemover != null && listaTarefas.remover(tarefaRemover.getId())) {
                        System.out.println("Tarefa removida");
                    } else {
                        System.out.println("Tarefa não encontrada");
                    }
                    break;
                case LISTAR:
                    tela.listarTarefas(listaTarefas.listar());
                    break;
            }
        } while (opcaoMenu != MenuPrincipal.SAIR);
    }
}
