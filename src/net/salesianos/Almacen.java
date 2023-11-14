package net.salesianos;

import java.util.LinkedList;
import java.util.Queue;

public class Almacen {
    private int capacidad;
    private Queue<Verduras> verduras;

    public Almacen(int capacidad) {
        this.capacidad = capacidad;
        this.verduras = new LinkedList<>();
    }

    public synchronized void depositarVerdura(Verduras verdura) throws InterruptedException {
        while (verduras.size() >= capacidad) {
            wait();
        }
        verduras.add(verdura);
        System.out.println("Nueva verdura (" + verdura.getTipo() + ") producida por " + verdura.getGranjero());
        notifyAll();
    }

    public synchronized Verduras consumirVerdura() throws InterruptedException {
        while (verduras.isEmpty()) {
            wait();
        }
        Verduras verdura = verduras.poll();
        System.out.println(verdura.getTipo() + " consumida por " + Thread.currentThread().getName());
        notifyAll();
        return verdura;
    }
}
