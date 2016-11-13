/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessinjava;

/**
 *
 * @author Ramon
 */
public class Tablero {
    private int filas=10;
    private int columnas=10;
    
    public Tablero(){
        this.filas=8;
        this.columnas=8;
        construirTablero();
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    
    private void construirTablero(){
        char casillas [][] = new char[8][8];
       construirTableroFila1();
       construirTableroColumna1();
       
      
    }
       
    private void construirTableroFila1(){
          for (int j=1; j<this.filas+1; j++){
             System.out.print("\t" + j);
           
        }
    }
    
     private void construirTableroColumna1() {
          System.out.print("\n");
          System.out.print("A\n\n");
          System.out.print("B\n\n");
          System.out.print("C\n\n");
          System.out.print("D\n\n");
          System.out.print("E\n\n");
          System.out.print("F\n\n");
          System.out.print("G\n\n");
          System.out.print("H\n\n");
        
    }
     
    
}
