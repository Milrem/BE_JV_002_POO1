package br.com.letscode.aula07;

import java.util.Date;

public class Tarefa {
    private int id;
    private String titulo;
    private Date dataPrevista;
    private Date dataConclusao;
    private Prioridade prioridade;

    private double progresso;

    public Tarefa(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        dataPrevista = null;
        dataConclusao = null;
        prioridade = Prioridade.NORMAL;
        progresso = 0;
    }

    public int getId() {
        return id;
    }

    public boolean isConcluida() {
        return dataConclusao != null;
    }

    public void concluir() {
        this.dataConclusao = new Date();
        this.progresso = 100;
    }

    public void avancar() {
        if (progresso < 100) {
            this.progresso = this.progresso + 25;
        }
        if (progresso >= 100) {
            progresso = 100;
            concluir();
        }
    }

    public void reativar() {
        this.dataConclusao = null;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(Date dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public double getProgresso() {
        return progresso;
    }

    public void setProgresso(double progresso) {
        this.progresso = progresso;
    }
}
