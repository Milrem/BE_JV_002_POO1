package br.com.letscode.aula07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Informe o primeiro número:");
                long x1 = sc.nextLong();

                System.out.println("Informe o segundo número:");
                long x2 = sc.nextLong();

                System.out.printf("%d x %d = %d%n", x1, x2, x1 * x2);

                if (x1 == x2) {
                    sc.close();
                }
            } catch (IllegalStateException ex) {
                System.out.println("Ocorreu um problema!\n " + ex.getMessage());
            } catch (InputMismatchException ex) {
                sc.nextLine();
                System.out.println("Número inválido!!! \n Tente novamente");
            }
        } while (true);
    }
}
