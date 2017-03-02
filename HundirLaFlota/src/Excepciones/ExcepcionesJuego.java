/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author urco1
 */
public class ExcepcionesJuego extends Exception{
    int error;
    public ExcepcionesJuego(int error){
        this.error=error;
    }
    @Override
    public String getMessage(){
        switch (this.error) {
            case 1:return "Has puesto la coordenada x mal";
            case 2:return "Has puesto la coordenada y mal";
                
 
            default:return "A surgido un error";
                
        }
    }
}
