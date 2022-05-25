package br.com.letscode.aula02;

public class Agenda {
    private final int MAXIMO_NUMERO_DE_CONTATOS = 10;

    private Contato[] listaDeContatos = new Contato[MAXIMO_NUMERO_DE_CONTATOS];

    private int proximoLivre() {
        for (int i = 0; i < listaDeContatos.length; i++) {
            if (listaDeContatos[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void adicionar(Contato contato) {
        int i = proximoLivre();
        if (i >= 0) {
            listaDeContatos[i] = contato;
        }
    }

    public void remover(Contato contato) {
        for (int i = 0; i < listaDeContatos.length; i++) {
            if (contato.equals(listaDeContatos[i])) {
                listaDeContatos[i] = null;
            }
        }
    }

    public int getTotal() {
        int total = 0;
        for (Contato contato : listaDeContatos) {
            if (contato != null) {
                total++;
            }
        }
        return total;
    }

    public Contato getContato(int index) {
        if (index >= 0 && index < listaDeContatos.length) {
            return listaDeContatos[index];
        }
        return null;
    }
}
