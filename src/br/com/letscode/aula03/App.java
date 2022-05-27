package br.com.letscode.aula03;

public class App {
    public static void main(String[] args) {
        TarefasList listaDeTarefas = new TarefasList();

        Tarefa tarefa1 = new Tarefa(1, "Fazer café");
        listaDeTarefas.adicionar(tarefa1);
        listaDeTarefas.adicionar(new Tarefa(2, "Tomar banho"));

        System.out.printf("Total de tarefas é %d", listaDeTarefas.listar().length);
    }
}
