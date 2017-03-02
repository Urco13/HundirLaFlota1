/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosJuego;



/**
 *
 * @author urco1
 */
public final class Tablero {
    private static final int NUMEROX=10;
    private static final int NUMEROY=10;
    private static final String [][] tableroJuego=new String[NUMEROX][NUMEROY];
    private static final String [][] dibujoTablero=new String[NUMEROX][NUMEROY];
    public Tablero(){
        TableroJuego();
    }
    
    //Tablero
    public void TableroJuego(){
        
        for (int i = 0; i < tableroJuego.length; i++) {
            for (int j = 0; j < tableroJuego.length; j++) {
               tableroJuego[i][j]="MAR";
            }
        }
        //inizializamos el array dibujo tablero
       for (int i = 0; i < dibujoTablero.length; i++) {
            for (int j = 0; j < dibujoTablero.length; j++) {
                dibujoTablero[i][j]="|--MAR-";
            }
        }
       
         System.out.println();
    }//fin TableroJuego
    
   /////DibujarTablero
     public void dibujarTablero(){
         
         for (int i = 0; i < dibujoTablero.length; i++) {
            System.out.println();
            for (int j = 0; j < dibujoTablero.length; j++) {
                if (tableroJuego[i][j].compareTo("BARCO")==0) {
                    dibujoTablero[i][j]="|--MAR-";
                }else if (tableroJuego[i][j].compareTo("HUNDIDO")==0) {
                    dibujoTablero[i][j]="|HUNDIDO";
                }else if (tableroJuego[i][j].compareTo("AGUA")==0) {
                    dibujoTablero[i][j]="|-AGUA-";
                }
                System.out.print(dibujoTablero[i][j]);
            }
        }
         System.out.println();
    }//fin dibujarTablero
     
    ///////ComprobarCoordenadasDeBarcos
    public boolean comprobarCoordenadasBarcos(int cordenadaX, int cordenadaY){
        
        if (this.tableroJuego[cordenadaX][cordenadaY].compareTo("MAR")==0) {
            System.out.println("Si es igual");
            this.tableroJuego[cordenadaX][cordenadaY]="BARCO"; 
            return true;
        }
        return false;
    }
    
    //comprobarDisparosJugador
    public void comprobarDisparosJugador(int coordenadasDisparoX, int coordenadasDisparoY){
        
        if (tableroJuego[coordenadasDisparoX][coordenadasDisparoY].compareTo("BARCO")==0) {
            tableroJuego[coordenadasDisparoX][coordenadasDisparoY]="HUNDIDO";
            System.out.println("Barco tocado y hundido");
            }
        
        if (tableroJuego[coordenadasDisparoX][coordenadasDisparoY].compareTo("MAR")==0) {
            tableroJuego[coordenadasDisparoX][coordenadasDisparoY]="AGUA";
            System.out.println("Mala suerte has dado en el agua");
            }
        if (tableroJuego[coordenadasDisparoX][coordenadasDisparoY].compareTo("HUNDIDO")==0) {
            System.out.println("Mala suerte has desperdiciado un tiro aqui ya undistes un barco");
            }
        if (tableroJuego[coordenadasDisparoX][coordenadasDisparoY].compareTo("AGUA")==0) {
            System.out.println("Mala suerte has desperdiciado un tiro aqui ya dispararas");
            }
    }//finComprobarDisparos
    
}//fin class
 