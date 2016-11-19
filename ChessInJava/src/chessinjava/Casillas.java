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
public class Casillas {
    private String letras;
    private int numeros;
    
    public Casillas(){
        letras="";
        numeros=0;
    }
    
    public Casillas(int numero){
        this.letras="";
        this.numeros = numero;
    }
    
    public Casillas(String letra){
        this.letras=letra;
        this.numeros=0;
    }

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }
    
    
}
