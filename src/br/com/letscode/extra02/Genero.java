package br.com.letscode.extra02;

public enum Genero {
    MASCULINO(22),
    FEMININO(20.8);

    private final double IMC_MEDIO;

    Genero(double IMC_MEDIO) {
        this.IMC_MEDIO = IMC_MEDIO;
    }

    public double getIMC_MEDIO() {
        return IMC_MEDIO;
    }
}
