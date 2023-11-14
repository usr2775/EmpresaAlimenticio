package net.salesianos;

import java.util.Random;

public class Cliente extends Thread {
    private String nombre;
    private int cantidadVerdurasConsumir;
    private Almacen almacen;
    private int tiempoConsumicionMaximo;


    public Cliente(String nombre, int cantidadVerdurasConsumir, Almacen almacen, int tiempoConsumicionMaximo) {
        this.nombre = nombre;
        this.cantidadVerdurasConsumir = cantidadVerdurasConsumir;
        this.almacen = almacen;
        this.tiempoConsumicionMaximo = tiempoConsumicionMaximo;
    }

    @Override
    public void run() {
        for (int i = 0; i < cantidadVerdurasConsumir; i++) {
            try {
                Verduras verdura = almacen.consumirVerdura();
                System.out.println(nombre + " está consumiendo " + verdura.getTipo() + " de " + verdura.getGranjero());
                sleep(getTiempoConsumicion(verdura));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private long getTiempoConsumicion(Verduras verdura) {
        Random random = new Random();
        return random.nextInt(tiempoConsumicionMaximo);
    }
}
