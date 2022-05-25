package br.com.letscode.aula02;

public class Pessoa {
    private String nome = "Juliana";
    private String sobrenome = "Dal Olio";
    private String apelido = "Ju";

    private int aniversarioDia;
    private int aniversarioMes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getAniversarioDia() {
        return aniversarioDia;
    }

    public void setAniversarioDia(int aniversarioDia) {
        this.aniversarioDia = aniversarioDia;
    }

    public int getAniversarioMes() {
        return aniversarioMes;
    }

    public void setAniversarioMes(int aniversarioMes) {
        this.aniversarioMes = aniversarioMes;
    }
}
