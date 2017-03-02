/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import Excepciones.ExcepcionesJuego;
import Juego.Juego;

/**
 *
 * @author urco1
 */
public class HundirLaFlota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExcepcionesJuego {
        try{
        Juego miJuego=new Juego();
        }catch(ExcepcionesJuego ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
