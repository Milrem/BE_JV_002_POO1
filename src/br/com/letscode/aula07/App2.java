package br.com.letscode.aula07;

public class App2 {
    public static void main(String[] args) {
        TarefasList listaDeTarefas = new TarefasList();

        Tarefa tarefa1 = new Tarefa(1, "Fazer café");
        listaDeTarefas.adicionar(tarefa1);
        listaDeTarefas.adicionar(new Tarefa(2, "Tomar banho"));

        System.out.printf("Total de tarefas é %d", listaDeTarefas.listar().length);

        try {
            listaDeTarefas.remover(5);
            System.out.println("Tarefa removida");
        } catch (TarefaNaoLocalizadaException e) {
            System.out.println(e.getMessage());
        }
    }
}
