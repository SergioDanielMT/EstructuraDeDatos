package pal500;

import java.util.Scanner;
import java.util.Random;

/**
 * @author Sergio Daniel MArtinez Toral
 */
public class Pal500 {

    Scanner sc = new Scanner(System.in);

    static class Nodo {  //Clase plantilla nodo

        char Dato1, Dato2, Dato3, Dato4, name;
        Nodo Next;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pal500 n = new Pal500();
        int opc;

        do {

            System.out.println("\n Menu de opciones ingrese una opción :"
                    + "\n 1-Generar 500 Nodos "
                    + "\n 2-Mostrar los 500 Nodos"
                    + "\n 3-Ordenar de A-Z"
                    + "\n 4-Ordenar de Z-A"
                    + "\n 5-Eliminar repetidos"
                    + "\n 6-Salir ");

            switch (opc = sc.nextInt()) { //Se abre un switch para evaluar lo que elija el usuario de a cuerdo al menu

                case 1:  //caso uno Agregar
                    n.Agregar();  //se manda a traer el metodo agregar de la case Nodo500
                    break; //cierra caso uno

                case 2: //caso dos Mostrar
                    n.Mostrar(); //se manda a traer el metodo mostrar de la clase Nodo500
                    break; //cierra caso dos 

                case 3: //caso tres Ordenar MAyor a Menor
                    n.AZ(); //se manda a traer el metodo ordenar mayor a menor de la clase Nodo500
                    break; //cierra caso tres  

                case 4: //caso cuatro Ordenar MEnor Mayor
                    n.ZA(); //se manda a traer el metodo ordenar menor a mayor en la clase Nodo500
                    break; //cierra caso cuatro

                case 5: //caso cinco Eliminar repetidas
                    n.Repetidos(); //se manda a traer el metodo Eliminar a la clase Nodo55
                    break; //cierra caso cinco

            }
        } while (opc != 7);
    }

    Nodo inicio = null;
    Nodo fin = null;
    char r;

    //METODO PEDIR AL USUARIO AGREGAR 500 NODO DE JALON
    public void Agregar() {
        int cont;
        Random r = new Random();

        for (cont = 1; cont <= 500; cont++) {
            Nodo temp = new Nodo();

            if (inicio == null) {
                temp.Dato1 = (char) (r.nextInt(26) + 'a');
                /*Se va a elegir una letra mayuscula usando codigo ascci*/
                temp.Dato2 = (char) (r.nextInt(25) + 'a');
                temp.Dato3 = (char) (r.nextInt(25) + 'a');
                temp.Dato4 = (char) (r.nextInt(25) + 'a');
                inicio = temp;
                inicio.Next = null;
                fin = temp;

            } else {

                temp.Dato1 = (char) (r.nextInt(26) + 'a');
                /*Se va a elegir una letra mayuscula usando codigo ascci*/
                temp.Dato2 = (char) (r.nextInt(25) + 'a');
                temp.Dato3 = (char) (r.nextInt(25) + 'a');
                temp.Dato4 = (char) (r.nextInt(25) + 'a');
                fin.Next = temp;
                temp.Next = null;
                fin = temp;
            }
        }
        System.out.println("LOS DATOS HAN SIDO AGREGADOS");
    }

    //METODO MOSTRAR NODOS
    public void Mostrar() {
        Nodo actual = new Nodo();
        actual = inicio;

        if (inicio != null) {
            while (actual != null) {
                System.out.println(" [ " + actual.Dato1 + actual.Dato2 + actual.Dato3 + actual.Dato4 + " ] ");
                actual = actual.Next;
                //cont++;
            }
        } else {
            System.out.println(" NO HAY DATOS EN LISTA ");
        }

    }

    public void AZ() {

    }

    public void ZA() {

    }

    public void Repetidos() {

    }

   

}
