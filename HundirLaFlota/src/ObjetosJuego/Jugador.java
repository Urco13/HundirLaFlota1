/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosJuego;


import Excepciones.ExcepcionesJuego;
import Utilidades.Utilidades;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author urco1
 */
public class Jugador {
    static BufferedReader bufer= new BufferedReader(new InputStreamReader(System.in));
    Utilidades misUtilidades=new Utilidades();
    private final int [] coordenadasXY=new int[2];
    
    //constructor
    public Jugador(){

    }
    
    //coordenadasDisparoJugador1
    
    //comprobamos que la coordenada x este bien
    public int[] coordenadasDisparo() throws ExcepcionesJuego{
        int sw=1;
        do {
            try{
            sw=1;
            this.coordenadasXY[0]=misUtilidades.leerPantalla("Es tu turno a que cordenadas quieres disparar\n\n"
                + "Dime la Coordenada X");
    
            
        if (coordenadasXY[0]<0 || coordenadasXY[0]>9) {
           throw new ExcepcionesJuego(1);
        }
            }catch(ExcepcionesJuego ex){
                System.out.println(ex.getMessage());
                sw=0;
                }
        }while(sw==0);
        
        //comprovamos que la cordenada y este bien
       do{
           sw=1;
           try{
       this.coordenadasXY[1]=misUtilidades.leerPantalla("Dime la Coordenada Y");
       if (coordenadasXY[1]<0 || coordenadasXY[1]>9) {
           throw new ExcepcionesJuego(2);
        }
            }catch(ExcepcionesJuego ey){
                System.out.println(ey.getMessage());
                sw=0;
            }
        }while(sw==0);
          return coordenadasXY;
    }
        
    public int coordenasXDisparoJugador1(){
        return this.coordenadasXY[0];
    }
    public int coordenasYDisparoJugador1(){
        return this.coordenadasXY[1];
    }
}
