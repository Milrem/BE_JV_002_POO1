package br.com.letscode.extra02;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private MedidaCorporal medidaCorporal;
    private List<MedidaCorporal> medidas;
    private Genero genero;

    public Pessoa(double pesoEmKg, double alturaEmMetros, Genero genero) {
        this.medidaCorporal = new MedidaCorporal();
        this.medidaCorporal.setPesoEmKg(pesoEmKg);
        this.medidaCorporal.setAlturaEmMetros(alturaEmMetros);
        this.medidas = new ArrayList<>();
        this.genero = genero;
    }

    public double getPeso() {
        return medidaCorporal.getPesoEmKg();
    }

    public void setPeso(double pesoEmKg) {
        medidas.add(medidaCorporal.clone());
        this.medidaCorporal.setPesoEmKg(pesoEmKg);
    }

    public double getAltura() {
        return medidaCorporal.getAlturaEmMetros();
    }

    public void setAltura(double alturaEmMetros) {
        medidas.add(medidaCorporal.clone());
        this.medidaCorporal.setAlturaEmMetros(alturaEmMetros);
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<MedidaCorporal> getMedidas() {
        return medidas;
    }
}
