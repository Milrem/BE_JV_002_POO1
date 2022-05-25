package br.com.letscode.aula02;

public class App {
    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();

        for (int i = 0; i < 5; i++) {
            Contato contato = new Contato();
            agenda1.adicionar(contato);
        }

        Contato contato = agenda1.getContato(3);
        agenda1.remover(contato);

        System.out.println("oi");
    }
}
