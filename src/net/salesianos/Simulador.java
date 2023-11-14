package net.salesianos;

public class Simulador {
    public static void main(String[] args) {
        Almacen almacen = new Almacen(5);

        Granjero paco = new Granjero("Paco", 5, almacen);

        Cliente faustino = new Cliente("Faustino", 5, almacen, 50);

        paco.start();
        faustino.start();
     

        try {
            paco.join();
            faustino.join();
         

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Todo los thread se han ejecutado");

    }
}