package br.com.letscode.extra02;

public class PessoaFisio extends Pessoa {
    public PessoaFisio(double pesoEmKg, double alturaEmMetros, Genero genero) {
        super(pesoEmKg, alturaEmMetros, genero);
    }

    @Override
    public double getPeso() {
        return super.getPeso() * .8;
    }

    public double getIMC() {
        return getPeso() / (getAltura() * getAltura());
//        return SaudeHelper.calcularIMC(this);
    }

    public double getPesoIdeal() {
        return SaudeHelper.calcularPesoIdeal(this);
    }

    public String getClassificacaoIMC() {
        return SaudeHelper.classificacaoIMC(this);
    }
}
