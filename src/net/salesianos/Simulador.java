package net.salesianos;

public class Simulador {
public static void main (String[] args) throws Exception {
        Almacen almacen = new Almacen(5);

        Granjero paco = new Granjero("Paco", 10, almacen, 20);
        paco.setPriority(Thread.MAX_PRIORITY); 

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