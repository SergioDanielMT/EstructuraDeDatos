package abc;

import java.util.Scanner;


/**
 *
 * @author hp
 */
public class abecedario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);//declarar emtrada de teclado

        int tope = 0,op = 0;
        
        char[] letra = new char[26];//tamaño del vector
        
        do {
            
            System.out.println("1. agregar\n" + "2. eliminar\n" + "3. mostrar\n" + "4. salir\n");//interfaz de menú
            
            switch(op = rd.nextInt()){
                
                case 1://caso 1
                    
                    if (tope == letra.length) {//condición 
                        System.out.println("pila llena...");//mensaje de pila llena
                    }else{
                        System.out.println("valores agregados:");//mensaje de ingresar
                        letra[tope] = rd.next().charAt(0);
                        System.out.println(tope+". ");
                        tope++;
                    break;    
                    }
                        
                case 2: 
                    if (tope > 0) {

                        System.out.println("Dato eliminado" + tope);//mensaje de eliminar
                        tope--;

                    } else {

                        System.out.println("pila vacia");//mensaje de pila vacia 

                    }
                    break;
                case 3: 
                    if (tope > 0) {

                        for (int i = tope - 1; i >= 0; i--) {//condición sobre el vector 
                            System.out.println(" " + letra[i]);
                        }
                    } else {
                        System.out.println("pila vacia");
                    }
                    break;
            }
            
            
            
            
             
        } while (op != 4);
        
      
    }
}
        