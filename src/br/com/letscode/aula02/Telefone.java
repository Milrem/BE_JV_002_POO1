package br.com.letscode.aula02;

public class Telefone {
    private String ddd = "33";
    private String numero = "2222-5555";
    private String tipo = "fixo";
    private String operadora = "morto";

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero.length() > 8) {
            this.numero = numero;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
}
