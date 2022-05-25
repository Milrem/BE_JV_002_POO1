package br.com.letscode.aula02;

public class Contato {
    private Pessoa pessoa;
    private Telefone principal;
    private Telefone auxiliar;
    private Endereco residencia;
    private Empresa trabalho;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Telefone getPrincipal() {
        return principal;
    }

    public void setPrincipal(Telefone principal) {
        this.principal = principal;
    }

    public Telefone getAuxiliar() {
        return auxiliar;
    }

    public void setAuxiliar(Telefone auxiliar) {
        this.auxiliar = auxiliar;
    }

    public Endereco getResidencia() {
        return residencia;
    }

    public void setResidencia(Endereco residencia) {
        this.residencia = residencia;
    }

    public Empresa getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Empresa trabalho) {
        this.trabalho = trabalho;
    }
}
