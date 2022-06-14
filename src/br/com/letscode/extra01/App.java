package br.com.letscode.extra01;

import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Estacionamento estacionamento1 = new Estacionamento(2);

        calendar.set(2022, Calendar.JUNE, 13, 13, 25, 0);
        estacionamento1.passandoNaCancela("HDN-3198", calendar.getTime());
        calendar.set(2022, Calendar.JUNE, 13, 15, 45, 0);
        estacionamento1.passandoNaCancela("XXX-9987", calendar.getTime());
        calendar.set(2022, Calendar.JUNE, 13, 15, 45, 0);
        estacionamento1.passandoNaCancela("XZZ-9987", calendar.getTime());

        calendar.set(2022, Calendar.JUNE, 13, 15, 25, 0);
        estacionamento1.passandoNaCancela("HDN-3198", calendar.getTime());
        calendar.set(2022, Calendar.JUNE, 13, 17, 55, 0);
        estacionamento1.passandoNaCancela("XXX-9987", calendar.getTime());
        calendar.set(2022, Calendar.JUNE, 13, 17, 55, 0);
        estacionamento1.passandoNaCancela("XZZ-9987", calendar.getTime());

        estacionamento1.exibirRelatorio();
    }
}
