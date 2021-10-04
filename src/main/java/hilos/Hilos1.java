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
public class Hilos1 extends Thread{ //Hereda de la clase Thread. Que incluye la interfaz Runnable.
    
    // Atributos de la clase
    String nombre;
    int baseDatos[] = new int[5];
    
    // Constructor vacio
    public Hilos1(){        
    }

    /*******************************************************************
    Poliformismo: Reescribir metodos abstractos de la interfaz Runnable.
    Metodo que se ejecuta de forma simultanea.
    *******************************************************************/
    
    @Override 
    public void run(){
        /*******************************************************************
            Dentro de run se ejecuta de forma simultanea con otros HILOS.
        *******************************************************************/
        for (int i = 0; i < 100; i++) {
            System.out.println("Hilo 1: A correr");
        }
    }
    
    // Metodos normales
    
    public void saludar(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hola que tal");
        }
    }
}
