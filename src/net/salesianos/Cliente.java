package net.salesianos;


public class Cliente extends Almacen implements  Runnable {
    private String nombre;
    private Almacen almacen;

    public Cliente(String nombre, Almacen almacen) {
        this.nombre = nombre;
        this.almacen = almacen;
    }

    @Override
    public void run() {
    }
}

