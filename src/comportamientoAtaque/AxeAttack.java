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
public class AxeAttack implements ComportamientoAtaque{
    private int danioGenerado;  

    public AxeAttack(int dañoGenerado) {
        this.danioGenerado = dañoGenerado;
    }

    public int getDañoGenerado() {
        return danioGenerado;
    }

    public void setDañoGenerado(int dañoGenerado) {
        this.danioGenerado = dañoGenerado;
    }

    @Override
    public int getPuntosDanio() {
        return danioGenerado;
    }
    
    
}
