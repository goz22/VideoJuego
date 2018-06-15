/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamientoAtaque;

import java.util.Random;

/**
 *
 * @author gozie
 */
public class BowAttack implements ComportamientoAtaque{
    private int danioGenerado;
    private int danioPorCritico;
    
    public BowAttack(){
        this.danioGenerado=20;
        this.danioPorCritico=95;
    }
    
    public int getDanioGenerado(){
        return danioGenerado;
    }
    
    public void setDanioGenerado(int danioGenerado){
        this.danioGenerado=danioGenerado;
    }

    public int getDanioPorCritico() {
        return danioPorCritico;
    }

    public void setDanioPorCritico(int danioPorCritico) {
        this.danioPorCritico = danioPorCritico;
    }
    
    

    @Override
    public int getPuntosDanio() {
       //return danioGenerado;
       Random rnd = new Random(5);
       return new Random().nextInt(danioGenerado+1);
    }
}
