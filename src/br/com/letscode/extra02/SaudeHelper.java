package br.com.letscode.extra02;

public class SaudeHelper {
    public static double calcularIMC(Pessoa pessoa) {
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }

    public static double calcularPesoIdeal(Pessoa pessoa) {
        return (pessoa.getAltura() * pessoa.getAltura()) * pessoa.getGenero().getIMC_MEDIO();
    }

    public static String classificacaoIMC(Pessoa pessoa) {
        double imc = calcularIMC(pessoa);
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
