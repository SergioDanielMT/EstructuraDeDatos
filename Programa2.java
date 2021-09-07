/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Programa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random ale = new Random (); //Definir variable para random
        Scanner sc = new Scanner (System.in);//Para introducir datos por teclado
        System.out.println("Ingrese el tamaño del vector");//Pedir por pantalla el tamaño del vector
        int tam = sc.nextInt();//Donde se almacena el tamaño del vector ingresado por el usuario
        int suma=0;//variable para la suma de los resultados 
        
        
        int[] Mat = new int [tam];//vector definido
        for (int i = 0; i <Mat.length; i++) {
            Mat[i] = ale.nextInt(200-100+1)+100;//eleccion de número random dando valores de que númer hasta cual
        }
        System.out.println("La matriz es:  \n");//impreción en pantalla 
        for (int i=0;i<Mat.length; i++) {
           suma = suma + Mat[i];//suma de los numeros del vector
                System.out.println(" " + Mat [i]);//inmpreción del vector
                
            }
        System.out.println("La suma de los vectores es: "+ suma);//impresion de la suma del vector
            System.out.println(" ");
    
            
    }
    
}
