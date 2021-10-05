/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlosc
 */
public class HiloUnico extends Thread{
    
    Auxiliar aux;

    public HiloUnico() {
    }

    public HiloUnico(Auxiliar aux) {
        this.aux = aux;
    }

    @Override
    public void run(){
        CrearAuxiliar();
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println(aux.nombre);
                sleep(aux.tiempoEspera); // Espera 100 milisegundos (0.1 segundos)
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloUnico.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    
    public void CrearAuxiliar( String frase, int tiempoEspera){
        Scanner sc = new Scanner(System.in);
        System.out.println("Frase a repetir: ");
        aux.nombre = sc.nextLine();
        aux.tiempoEspera = 500;
    }
}
