package net.salesianos;

import java.util.Random;

public class Granjero extends Thread {
    private String nombre;
    private int cantidadVerdurasPlantar;
    private Almacen almacen;
    private int maxTiempoCrecimiento; 

    public Granjero(String nombre, int cantidadVerdurasPlantar, Almacen almacen, int maxTiempoCrecimiento) {
        this.nombre = nombre;
        this.cantidadVerdurasPlantar = cantidadVerdurasPlantar;
        this.almacen = almacen;
        this.maxTiempoCrecimiento = maxTiempoCrecimiento;

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
                "broccoli", "artichoke", "tomato","marihuana", "cucumber", "eggplant", "carrot", "green bean"};

        Random random = new Random();
        String tipo = tiposVerduras[random.nextInt(tiposVerduras.length)];
        int tiempoCrecimiento = random.nextInt(maxTiempoCrecimiento);
        return new Verduras(tipo, nombre, tiempoCrecimiento);
    }
}
