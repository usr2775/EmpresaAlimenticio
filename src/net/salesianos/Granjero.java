package net.salesianos;

import java.util.Random;

public class Granjero extends Almacen implements Runnable{
              private String nombre;
              private Almacen almacen;
              private String[] verduras = {"lechuga", "repollo", "cebolla", "espinaca", "patata", "apio", "espárrago", "rábano", "brócoli", "alcachofa", "tomate", "pepino", "berenjena", "zanahoria", "judía verde"};



              public Granjero(String nombre, Almacen almacen) {
                            this.nombre = nombre;
                            this.almacen = almacen;
              }


              @Override
              public void run() {
                                  




              
              }
              
}
