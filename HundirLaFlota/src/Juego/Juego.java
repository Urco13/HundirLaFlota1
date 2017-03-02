/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;


import Excepciones.ExcepcionesJuego;
import ObjetosJuego.*;

import Utilidades.Utilidades;


/**
 *
 * @author urco1
 */
public  class Juego {
     private Utilidades misUtilidades;
     private final  Tablero miTablero=new Tablero();
     private final Barco Barco1=new Barco();
     private final Barco Barco2=new Barco();
     private final Barco Barco3=new Barco();
     private final Barco Barco4=new Barco();
     private final Barco Barco5=new Barco();
     private final Jugador jugador1 =new Jugador();
     
    //constructor
    public Juego() throws ExcepcionesJuego{
       menuJuego();
    }//fin constructor

    //menuJuego
    private  void menuJuego() throws ExcepcionesJuego{
        switch (new Utilidades().leerPantalla("Quieres jugar a undir la flota\n1-Si\n2-No")) {
            case 1:
                posicionarBarcosTablero();
                miTablero.dibujarTablero();
                int sw=0;
                while(sw<6){
                jugador1.coordenadasDisparo();
                miTablero.comprobarDisparosJugador(jugador1.coordenasXDisparoJugador1(), jugador1.coordenasYDisparoJugador1());
                miTablero.dibujarTablero();
                sw++;
                }
                break;
            case 2:
                break;
        }
    }//fin menu
   
    //posicionInicialDeLosBarcos
   private  void posicionarBarcosTablero(){
         int sw=0;  
        do {
            Barco1.coordenadasBarco();
            if (miTablero.comprobarCoordenadasBarcos(Barco1.getCoordenadaX(), Barco1.getCoordenadaY())) {
                
            sw=1;
        }
        } while (sw==0);
        do {
            Barco2.coordenadasBarco();
            if (miTablero.comprobarCoordenadasBarcos(Barco2.getCoordenadaX(), Barco2.getCoordenadaY())) {
                
            sw=1;
        }
        } while (sw==0);
        do {
            Barco3.coordenadasBarco();
            if (miTablero.comprobarCoordenadasBarcos(Barco3.getCoordenadaX(), Barco3.getCoordenadaY())) {
            sw=1;
        }
        } while (sw==0);
        do {
            Barco4.coordenadasBarco();
            if (miTablero.comprobarCoordenadasBarcos(Barco4.getCoordenadaX(), Barco4.getCoordenadaY())) {
            sw=1;
        }
        } while (sw==0);
        do {
            Barco5.coordenadasBarco();
            if (miTablero.comprobarCoordenadasBarcos(Barco5.getCoordenadaX(), Barco5.getCoordenadaY())) {
            sw=1;
        }
        } while (sw==0);
        
    }//finPosicionInicial
    
    
    
}//fin class
