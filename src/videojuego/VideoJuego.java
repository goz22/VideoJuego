/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuego;

import comportamientoAtaque.AxeAttack;
import comportamientoAtaque.BowAttack;
import comportamientoAtaque.Personaje;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gozie
 */
public class VideoJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personaje orco = new Personaje(10.5f, 200,"orco", new AxeAttack(35));
        Personaje elfo = new Personaje(5.0f, 200, "Elfo", new BowAttack());
        while(orco.estaVivo()&&elfo.estaVivo())
        {   
            if (new Random().nextBoolean()){
                orco.atacar(elfo);
                System.out.println("Orco. Elfo: " + elfo.getPuntosSalud());
            }
            else
            {   elfo.atacar(orco);
                System.out.println("Elfo. Orco: " + orco.getPuntosSalud());
            
            }
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException ex) {
                Logger.getLogger(VideoJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if (orco.estaVivo()) {
            System.out.println("GANO ORCO");
        } else {
            System.out.println("GANO ELFO");
        }
        
    }
    
}
