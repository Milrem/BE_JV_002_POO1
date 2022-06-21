package br.com.letscode.extra02;

/**
 * Calcular o IMC e peso ideal de uma pessoa.
 * Apresentar o resultado de classificação de acordo com a tabela:
 * IMC              CLASSIFICAÇÃO
 * <18,5            Baixo peso
 * 18,5 a 24,9      Peso normal
 * 25,0 a 29,9      Excesso de peso
 * 30,0 a 34,9      Obesidade de Classe 1
 * 35,0 a 39,9      Obesidade de Classe 2
 * ≥ 40,0           Obesidade de Classe 3
 *
 * Usando as fórmulas abaixo:
 *   - IMC = peso / altura²
 *   - Peso ideal = altura² * IMC médio
 *   - IMC médio para homens é 22
 *   - IMC médio para mulheres é 20,8
 *
 */
public class App {
    public static void main(String[] args) {
        Pessoa pessoa2 = new Pessoa(55.5, 1.60, Genero.FEMININO);
        System.out.printf("O IMC é %f e o peso ideal é %f %nSua classificação é %s %n", SaudeHelper.calcularIMC(pessoa2), SaudeHelper.calcularPesoIdeal(pessoa2), SaudeHelper.classificacaoIMC(pessoa2));
        Pessoa pessoa1 = new Pessoa(77.9, 1.70, Genero.MASCULINO);
        System.out.printf("O IMC é %f e o peso ideal é %f %nSua classificação é %s %n", SaudeHelper.calcularIMC(pessoa1), SaudeHelper.calcularPesoIdeal(pessoa1), SaudeHelper.classificacaoIMC(pessoa1));

        pessoa1.setPeso(73.6);
        System.out.printf("O IMC é %f e o peso ideal é %f %nSua classificação é %s %n", SaudeHelper.calcularIMC(pessoa1), SaudeHelper.calcularPesoIdeal(pessoa1), SaudeHelper.classificacaoIMC(pessoa1));

        pessoa1.setPeso(71.6);
        System.out.printf("O IMC é %f e o peso ideal é %f %nSua classificação é %s %n", SaudeHelper.calcularIMC(pessoa1), SaudeHelper.calcularPesoIdeal(pessoa1), SaudeHelper.classificacaoIMC(pessoa1));

        PessoaHelper helper = new PessoaHelper(pessoa1);
        helper.calcularIMC();

        PessoaHelper helper2 = new PessoaHelper(pessoa2);
        helper2.calcularIMC();

        SaudeHelper.calcularIMC(pessoa1);


        PessoaFisio pessoa3 = new PessoaFisio(55.5, 1.60, Genero.FEMININO);
        System.out.printf("O IMC é %f e o peso ideal é %f %nSua classificação é %s %n", pessoa3.getIMC(), pessoa3.getPesoIdeal(), pessoa3.getClassificacaoIMC());

    }
}
