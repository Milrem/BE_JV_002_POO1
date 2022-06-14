package br.com.letscode.extra01;

/*
    Um empresário comprou 2 terrenos em uma area central da cidade. Ele quer montar 2 estacionamentos e precisa de um
    sistema para controlar a entrada e saida dos veículos e controlar o valor a pagar conforme o tempo de permanência
    Porem é um requisito muito importante que o sistema seja o mais simples possível.
    Capacidade do estacionamento é variável e deve ser enviada na inicialização da aplicação

    Para um carro entrar ou saír no estabelecimento, a sua placa deverá ser fornecida ao sistema,
    caso não houver nenhuma outra entrada em aberto para aquela placa deverá ser exibida a mensagem:
    >> Entrada do veículo de placa: XXX

    Caso contrário deverá ser exibida a mensagem:
    >> Saída do veículo de placa: XXX. Tempo no estabelecimento: X minutos. Valor a ser cobrado: XX

     O valor a ser cobrado é definido pela seguinte forma:

    • De 0 a 5 minutos. Sem cobrança de valor
    • De 5 a 60 minutos. R$ 4,00
    • Acima de 60 minutos é cobrado um valor de R$ 6,00 por hora adicional.
        Ex.: 1 hora e 4 minutos de permanecia, deverá ser cobrado:
        4 reais da primeira hora e 6 reais dos 4 minutos que compoe a hora adicional. Total 10 reais.

   Ao encerrar o sistema deve ser exibido um relatório com o faturamento do estacionamento, contendo:
   Placa do veículo | Hora de entrada | Hora de saída | Valor cobrado.


 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Estacionamento {
    private final double VALOR_HORA = 4.00;
    private final double VALOR_HORA_ADICIONAL = 6.00;
    private final long TEMPO_LIVRE_DE_COBRANCA = 5;

    private int numeroVagas;
    private List<Veiculo> veiculos;

    public Estacionamento(int numeroVagas) {
        this.numeroVagas = numeroVagas;
        this.veiculos = new ArrayList<>();
    }

    public void passandoNaCancela(String placa, Date dataEHora) {
        Veiculo veiculo = null;
        for (Veiculo item : veiculos) {
            if (item.getPlaca().equalsIgnoreCase(placa)) {
                veiculo = item;
            }
        }
        if (veiculo != null) {
            //Veículo está saindo;
            veiculo.setHoraSaida(dataEHora);
            veiculos.remove(veiculo);
            System.out.printf("Saída do veículo de placa: %s. Tempo no estabelecimento: %d minutos. Valor a ser cobrado: %f %n", veiculo.getPlaca(), veiculo.getTempoPernamenciaEmMinutos(), valorACobrar(veiculo));
        } else {
            if (veiculos.size() < numeroVagas) {
                //Veículo está entrando;
                veiculo = new Veiculo(placa, dataEHora);
                veiculos.add(veiculo);
                System.out.println("Entrada do veículo de placa: " + placa);
            } else {
                System.out.println("Estacionamento lotado!!!");
            }
        }
    }

    private double valorACobrar(Veiculo veiculo) {
        long minutos = veiculo.getTempoPernamenciaEmMinutos();
        if (minutos <= TEMPO_LIVRE_DE_COBRANCA) {
            return 0;
        } else if (minutos <= 60) {
            return VALOR_HORA;
        } else {
            long horasExtras = (minutos / 60) - 1;
//            horasExtras = horasExtras + (minutos % 60 == 0 ? 0 : 1);
            if (minutos % 60 > 0) {
                horasExtras = horasExtras + 1;
            }
            return VALOR_HORA + (VALOR_HORA_ADICIONAL * horasExtras);
        }
    }

    public void exibirRelatorio() {
        System.out.printf("Placa do veículo | Hora de entrada | Hora de saída | Valor cobrado %n");
        System.out.printf("%s | %t | %t | %f %n", placa, horaEntrada, horaSaida, valorCobrado);
    }
}
