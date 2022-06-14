package br.com.letscode.extra01;

import java.util.Date;

public class Veiculo {
    private String placa;
    private Date horaEntrada;
    private Date horaSaida;

    public Veiculo(String placa, Date horaEntrada) {
        this.placa = placa;
        this.horaEntrada = horaEntrada;
    }

    public String getPlaca() {
        return placa;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public Date getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }

    public long getTempoPernamenciaEmMinutos() {
        long minutos = 0;
        if (horaSaida != null) {
            long milisegundos = horaSaida.getTime() - horaEntrada.getTime();
            minutos = milisegundos / (1000 * 60);
        }
        return minutos;
    }
}
