/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamientoAtaque;

/**
 *
 * @author gozie
 */
public class BluntAttack implements ComportamientoAtaque{
    private int danioGenerado;

    public BluntAttack(int danioGenerado) {
        this.danioGenerado = danioGenerado;
    }

    public int getDanioGenerado() {
        return danioGenerado;
    }

    public void setDanioGenerado(int danioGenerado) {
        this.danioGenerado = danioGenerado;
    }

    @Override
    public int getPuntosDanio() {
        return danioGenerado;
    }
    
    
}
