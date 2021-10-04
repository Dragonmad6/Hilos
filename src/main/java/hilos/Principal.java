/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author Carlosc
 */
public class Principal {
    
    public static void main (String[] args){
        
        Hilos1 hilo1 = new Hilos1();
        Runnable hilo2 = new Hilos2();
        
        
        HiloUnico hiloUnico1 = new HiloUnico("Hilo Unico 1");
        HiloUnico hiloUnico2 = new HiloUnico("Hilo Unico 2");
        
                
//        hilo1.start(); //Ejecuta el metodo run(). Si heredo Thread
//        hilo2.run(); //Ejecuta el metodo run(). Si implemento Runnable.
        
          hiloUnico1.start();
          hiloUnico2.start();

//        hilo1.saludar();
    }    
}
