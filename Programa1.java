/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.pkg1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Programa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random ale = new Random (); //definimos ale como random
        Scanner sc = new Scanner (System.in);//Para poder introducir datos por teclado
        System.out.println("Ingrese el tamaño de la matriz");//Pedimos matriz
        int tam = sc.nextInt();//Donde se almacena el valor de la Matriz
        System.out.println("Ingrese el tamaño de la matriz");
        int tam2 = sc.nextInt();
        
        
        int[][] Mat = new int [tam][tam2];//Definimos matriz
        for(int i = 0; i<Mat.length ; i++) {//ciclo for para acomo de los numeros
            for (int j = 0; j<Mat.length ; j++) {
              Mat[i][j] = ale.nextInt(100);//elección de los números randoms
            }
        }
        
        System.out.println("La matriz es:  ");
        for (int i=0;i<Mat.length; i++) {
            for (int j = 0; j <Mat.length; j++) {
                System.out.print("| "+Mat[i][j]);//Impreción de la matriz en pantalla
            }
            System.out.println(" |");
            
        }
    }
    
}
 
    

