package net.salesianos;

public class Verduras {
    private String tipo;
    private String granjero;
    private long tiempoPlantacion;
    private int tiempoCrecimiento;

    public Verduras(String tipo, String granjero, long tiempoPlantacion) {
        this.tipo = tipo;
        this.granjero = granjero;
        this.tiempoPlantacion = tiempoPlantacion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getGranjero() {
        return granjero;
    }

    public long getTiempoPlantacion() {
        return tiempoPlantacion;
    }

    public int getTiempoCrecimiento() {
        return tiempoCrecimiento;
    }
}
