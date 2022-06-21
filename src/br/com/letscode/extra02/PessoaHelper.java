package br.com.letscode.extra02;

public class PessoaHelper {
    private Pessoa pessoa;

    public PessoaHelper(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double calcularIMC() {
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }

    public double calcularPesoIdeal() {
        return (pessoa.getAltura() * pessoa.getAltura()) * pessoa.getGenero().getIMC_MEDIO();
    }

    public String classificacaoIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Baixo peso";
        } else if (imc <= 24.9) {
            return "Peso normal";
        } else if (imc <= 29.9) {
            return "Excesso de peso";
        } else if (imc <= 34.9) {
            return "Obesidade de Classe 1";
        } else if (imc <= 39.9) {
            return "Obesidade de Classe 2";
        } else {
            return "Obesidade de Classe 3";
        }
    }
}
