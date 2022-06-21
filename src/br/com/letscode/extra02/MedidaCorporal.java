package br.com.letscode.extra02;

public class MedidaCorporal {
    private double pesoEmKg;
    private double alturaEmMetros;

    public double getPesoEmKg() {
        return pesoEmKg;
    }

    public void setPesoEmKg(double pesoEmKg) {
        this.pesoEmKg = pesoEmKg;
    }

    public double getAlturaEmMetros() {
        return alturaEmMetros;
    }

    public void setAlturaEmMetros(double alturaEmMetros) {
        this.alturaEmMetros = alturaEmMetros;
    }

    public MedidaCorporal clone() {
        MedidaCorporal clone = new MedidaCorporal();
        clone.setPesoEmKg(this.pesoEmKg);
        clone.setAlturaEmMetros(this.alturaEmMetros);
        return clone;
    }
}
