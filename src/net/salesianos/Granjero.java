package net.salesianos;

import java.util.Random;

public class Granjero extends Thread {
    private String nombre;
    private int cantidadVerdurasPlantar;
    private Almacen almacen;
    private static final int MAX_TIEMPO_CRECIMIENTO = 5000;

    public Granjero(String nombre, int cantidadVerdurasPlantar, Almacen almacen) {
        this.nombre = nombre;
        this.cantidadVerdurasPlantar = cantidadVerdurasPlantar;
        this.almacen = almacen;
    }

    @Override
    public void run() {
        for (int i = 0; i < cantidadVerdurasPlantar; i++) {
            try {
                Verduras verdura = plantarVerdura();
                almacen.depositarVerdura(verdura);
                sleep(verdura.getTiempoCrecimiento());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private Verduras plantarVerdura() {
        String[] tiposVerduras = {"lettuce", "cabbage", "onion", "spinach", "potato", "celery", "asparagus", "radish",
                "broccoli", "artichoke", "tomato", "cucumber", "eggplant", "carrot", "green bean"};

        Random random = new Random();
        String tipo = tiposVerduras[random.nextInt(tiposVerduras.length)];
        int tiempoCrecimiento = random.nextInt(MAX_TIEMPO_CRECIMIENTO);
        return new Verduras(tipo, nombre, tiempoCrecimiento);
    }
}