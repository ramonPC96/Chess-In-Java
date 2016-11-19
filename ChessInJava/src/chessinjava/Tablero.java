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
       Casillas casillas [][] = new Casillas[this.filas][this.columnas];
       construirTableroFila1(casillas);
       construirTableroColumna1(casillas);
       construirTableroFila10(casillas);
       construirColumna10(casillas);
    }
    
       
    private void construirTableroFila1(Casillas casilla [][]){
          for (int i=0; i<filas; i++){
              casilla[0][i] = new Casillas(i+1);
              
              //muestra   
              System.out.print("\t");
              System.out.print(casilla[0][i].getNumeros());
              
          }
          
    }
    
     private void construirTableroColumna1(Casillas casilla [][]) {
          System.out.print("\n");
          casilla [0][0] = new Casillas("A");
          casilla [1][0] = new Casillas("B");
          casilla [2][0] = new Casillas("C");
          casilla [3][0] = new Casillas("D");
          casilla [4][0] = new Casillas("E");
          casilla [5][0] = new Casillas("F");
          casilla [6][0] = new Casillas("G");
          casilla [7][0] = new Casillas("H");
          
          //muestra
          for (int i=0; i<columnas; i++){
              if (i==0){
                  System.out.print("\n");
              }
              System.out.print(casilla[i][0].getLetras() +"\n\n");
          }
                
                          
    }
     
     private void construirTableroFila10(Casillas casilla [][]){
         for (int i=0; i<filas; i++){
              casilla[filas-1][i] = new Casillas(i+1);
              System.out.print("\t");
              //muestra
              System.out.print(casilla[filas-1][i].getNumeros());
              
          }
     }
     
     private void construirColumna10(Casillas casilla [][]){
          System.out.print("\n");
          casilla [0][7] = new Casillas("A");
          casilla [1][7] = new Casillas("B");
          casilla [2][7] = new Casillas("C");
          casilla [3][7] = new Casillas("D");
          casilla [4][7] = new Casillas("E");
          casilla [5][7] = new Casillas("F");
          casilla [6][7] = new Casillas("G");
          casilla [7][7] = new Casillas("H");
          
          //muestra
          for (int i=0; i<casilla.length; i++){
              System.out.print("\n");
              System.out.print(casilla[i][0].getLetras() +"\n\n");
          }
          
     }
     
    
}
