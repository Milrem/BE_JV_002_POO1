package br.com.letscode.aula01;

import java.util.Scanner;

public class App {
    private final String BEM_VINDO = "Bem vindo %s%n";
    private String nome;

    private void boasVindas() {
        System.out.printf(BEM_VINDO, this.nome);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o primeiro nome?");
        String nomeInformado = sc.nextLine();
        App app1 = new App();
        app1.nome = nomeInformado;

        System.out.println("Qual é o segundo nome?");
        nomeInformado = sc.nextLine();
        App app2 = new App();
        app2.nome = nomeInformado;

        app1.boasVindas();
        app2.boasVindas();
    }
}
