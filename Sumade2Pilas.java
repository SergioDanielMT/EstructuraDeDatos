/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumade.pkg2pilas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sergio Daniel
 */
public class Sumade2Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//ingresar por teclado
        Random ale = new Random ();//metodo para elegir los numeros randoms

        int top=0, topeB=0, op = 0, a = 0, b = 0, res;//definir variables
       

        System.out.println("Ingrese el tamaño de la pila A y B");//Pedimos tamaño de las pilas 
        int esp = sc.nextInt();//se aguarda el tamaño de la pila
        
        
        
        int[] pilaA = new int[esp];

        int[] pilaB = new int[esp];

        int[] pilaC = new int[esp+esp];

        do {

            System.out.println("\nSelecciona una opción: \n"
                    + "\n1. Llenar pila A y B\n"
                    + "2. Mostrar pilas A y B\n"
                    + "3. Vaciar pila A y B\n"
                    + "4. Unir pila A y B\n"
                    + "5. Mostrar pila C \n"
                    + "6. Salida\n");

            switch (op = sc.nextInt()) {

                case 1:

                    if (top == pilaA.length) {
                        System.out.println("pila llena...");
                    } else {
                        System.out.println("Valores aleatoreos insertados:");
                        for (int i = 0; i <pilaA.length; i++) {
                                pilaA[i] = ale.nextInt(100-1+1)+1;//eleccion de número random dando valores de que númer hasta c

                          }
                        if (topeB == pilaB.length) {
                        System.out.println("pila llena...");
                    } else {
                        System.out.println(" :v ");
                        for (int i = 0; i <pilaB.length; i++) {
                                 pilaB[i] = ale.nextInt(200-100+1)+100;//eleccion de número random dando valores de que númer hasta cual
                          }
                    }
                    }
                    break;

                case 2:

                    System.out.println("La pila A esta conformada por: \n");//impreción en pantalla
                   for (int i=0;i<pilaA.length; i++) {
                     System.out.println(" " + pilaA[i]);//inmpreción del vector
                     
            }
                   System.out.println("La pila B esta conformada por:  \n");//impreción en pantalla 
                   for (int i=0;i<pilaB.length; i++) {
                     System.out.println(" " + pilaB [i]);//inmpreción del vector
            }
                    break;

                case 3:
                        if (esp > 0) {

                        System.out.println("Datos de A eliminados: " + esp);//vaciar datos de la pila A
                        

                    } else {

                        System.out.println("pila A vacia");

                    }
                    if (esp > 0) {

                        System.out.println("Datos de B eliminados: " + esp);//vaciar datos de la pila B
                       

                    } else {

                        System.out.println("pila B vacia");

                    }
                    break;

                case 4:
                        System.out.println("Pila A y pila B se an unido ");//unir las pilasa A y B
		                  System.out.println("Correctamente");
                    break;

                case 5:
                    System.out.println("La suma de las pilas son: ");//hacer la sumatoria
                    for(int i = 0;i<pilaA.length;i++){
                            for(int j = 0;j<pilaB.length;j++){//de las pilas
                                if(i==j){
                                    res=pilaA[i]+pilaB[j];//del mismo modo como ingresaron 
                            System.out.println(res+" ");
                                }
                            }
                            
                        }

                    break;
            }

        } while (op != 6);//salir
    }
    
}
