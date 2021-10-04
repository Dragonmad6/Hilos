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
public class HiloUnico extends Thread{
    
    String frase;

    public HiloUnico() {
    }

    public HiloUnico(String frase) {
        this.frase = frase;
    }
    
    
    
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(frase);
        }
    }
    
    
}
