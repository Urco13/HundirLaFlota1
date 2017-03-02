/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author urco1
 */
public class Utilidades {
    static BufferedReader bufer= new BufferedReader(new InputStreamReader(System.in));
    public Utilidades(){
        
    }
    
    public int leerPantalla(String texto){
        int option=0;
        int sw=1;
        do{
        sw=1;
        System.out.println(texto);
        try{
        option=Integer.parseInt(bufer.readLine());
        }catch(NumberFormatException ex){
            System.out.println("Error");
            sw=0;
        }   catch (Exception ex) {
                System.out.println("Segundo Error");
            }
        
        }while(sw==0);
         return option;
    }
}
