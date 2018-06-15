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
public class Personaje {
    private float altura;
    private int puntosSalud;
    private String tipoPersonaje;
    ComportamientoAtaque ataque;
    
    public Personaje (float altura,int puntosSalud, String tipoPersonaje,ComportamientoAtaque ataque){
        this.altura=altura;
        this.puntosSalud=puntosSalud;
        this.tipoPersonaje=tipoPersonaje;
        this.ataque=ataque;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public void setPuntosSalud(int puntosSalud) {
        this.puntosSalud = puntosSalud;
    }
    
    public String getTipoPersonaje(){
        return tipoPersonaje;
    }
    
    public void setTipoPersonaje(String tipoPersonaje){
        this.tipoPersonaje= tipoPersonaje;
    }

    public ComportamientoAtaque getAtaque() {
        return ataque;
    }

    public void setAtaque(ComportamientoAtaque ataque) {
        this.ataque = ataque;
    }
    
    
    public void atacar (Personaje enemigo){
        enemigo.recibirDaño(ataque.getPuntosDanio());
        
    }
    
    public void recibirDaño(int danioRecibido){
        puntosSalud=puntosSalud-danioRecibido;
    }
    
    public boolean estaVivo(){
        boolean vivo=true;
        if(puntosSalud<=0)
        {   vivo=false;
        }
        return vivo;
    }
   
    
            
}
