/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosJuego;

import java.util.Random;

/**
 *
 * @author urco1
 */
public class Barco {
    static Random numeroAleatorio = new Random();
    private String tipo;
    private int coordenadaX=0;
    private int coordenadaY=0;
    private String estado="No hundido";
    public Barco(){
       
    }
    
    public void coordenadasBarco(){
        this.coordenadaX=numeroAleatorio.nextInt(10);
        this.coordenadaY=numeroAleatorio.nextInt(10);
   
    }


    public int getCoordenadaX() {
        return coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
    
}//fin class
