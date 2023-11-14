package net.salesianos;

public class Simulador {
    public static void main(String[] args) {
        Almacen almacen = new Almacen(5);

        Granjero paco = new Granjero("Paco", 10, almacen);
        Granjero ramon = new Granjero("Ramon", 10, almacen);

        Cliente faustino = new Cliente("Faustino", 5, almacen, 50);
        Cliente gentleman = new Cliente("Mr. Gentleman", 10, almacen, 50);
        Cliente loquendo = new Cliente("Loquendo", 5, almacen, 50);

        paco.start();
        ramon.start();
        faustino.start();
        gentleman.start();
        loquendo.start();

        try {
            paco.join();
            faustino.join();
            gentleman.join();
            loquendo.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Todo los thread se han ejecutado");

    }
}