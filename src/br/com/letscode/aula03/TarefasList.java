package br.com.letscode.aula03;

import java.util.ArrayList;
import java.util.List;

public class TarefasList {
    private List<Tarefa> tarefas = new ArrayList<>();

    public boolean adicionar(Tarefa tarefa) {
        return tarefas.add(tarefa);
    }

    public Tarefa[] listar() {
        return tarefas.toArray(new Tarefa[]{});
    }

    public int getTotal() {
        return tarefas.size();
    }

    public boolean remover(int id) {
        Tarefa tarefa = obterPorId(id);
        if (tarefa != null) {
            return tarefas.remove(tarefa);
        }
        return false;
    }

    private Tarefa obterPorId(int id) {
        for (Tarefa tarefa : tarefas) {
            if (id == tarefa.getId()) {
                return tarefa;
            }
        }
        return null;
    }

    public boolean atualizar(Tarefa novaTarefa) {
        Tarefa tarefa = obterPorId(novaTarefa.getId());
        if (tarefa != null) {
            tarefas.remove(tarefa);
            tarefas.add(tarefa);
            return true;
        }
        return false;
    }

    public boolean atualizar(int id, double progresso) {
        Tarefa tarefa = obterPorId(id);
        if (tarefa != null) {
            tarefa.setProgresso(progresso);
            return true;
        }
        return false;
    }

    public boolean concluir(int id) {
        Tarefa tarefa = obterPorId(id);
        if (tarefa != null) {
            tarefa.concluir();
            return true;
        }
        return false;
    }
}
