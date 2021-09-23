/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetidasabcd;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author SERGIODANIEL
 */
public class Repetidasabcd {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random tp = new Random();
        
        int top = 0, opt = 0;
        char[] pila = new char[26];
        char car;
        do {
            System.out.println("1 - llenar\n"
                    + "2 - eliminar\n"
                    + "3 - mostrar\n"
                    + "4 - repetidas\n"
                    + "5 - salir\n");
            switch (opt = sc.nextInt()) {
                case 1:
                    char letra = 'A';
                    for (int i = 0; i < 26; i++) {
                        if (top < 26) {
                            
                            letra = (char)(tp.nextInt(26) + 'a');
                            pila[top] = letra;//abc[i];
                            letra++;
                            top++;
                        } else {
                            System.out.println("La pila esta llena");
                            break;
                        }
                    }
                    break;
                case 2:
                    if (top > 0) {
                        System.out.println("Se elimino un dato" + top);
                        //restar unidad a tope, para poder reutilizar la posicion 
                        top--;
                    } else {
                        System.out.println("no hay elementos para eliminar");
                    }
                    break;
                case 3:
                    if (top > 0) {
                        for (int i = top - 1; i >= 0; i--) {
                            System.out.println(" " + pila[i]);
                        }
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    break;
                case 4: 
                //repetir
                    for (int i = 0 ; i < pila.length; i++) {
                        int cont = 0;
                        car = pila[i];
                           for (int j = 0 ; j < pila.length; j++){
                               if(pila[j] == car){
                                   cont++;
                               }
                           }
                           System.out.println(pila[i] + " se repite " + cont + " veces ");
                           cont = 0;
                        }
                    
                
                    break;
                case 5:
                    

                
            }
        } while (opt != 5);
    }
}