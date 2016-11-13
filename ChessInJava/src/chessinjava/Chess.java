/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessinjava;

import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class Chess {
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        opciones(menu());
        
        
    }
    
    private static int menu(){
        Scanner in = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Elegir opción:");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            opcion = in.nextInt();
            if(opcion>2){
                System.out.println("Opción incorrecta.");
            }
        }while(opcion>2);
        
        return opcion;
    }
    
    private static void opciones(int opcion){
        if (opcion==1){
            Tablero tablero = new Tablero();
            
        } else if (opcion==2){
            System.exit(0);
        }
    }
    
    
    
}
