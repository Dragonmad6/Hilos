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
public class Hilos2 implements Runnable{ //Implementa la interfaz Runnable.
    
    @Override
    public void run(){
        for (int i = 0; i < 200; i++) {
            System.out.println("Hilo 2: A correr");

        }
    }
    
    public void saludar(){
        for (int i = 0; i < 200; i++) {
            System.out.println("Hola que tal 2");

        }
    }
}
