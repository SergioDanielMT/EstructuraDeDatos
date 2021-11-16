package lissimple.eliminar; //JESSICA VIRIDIANA GARCIA SILVA

import java.util.Scanner; 

public class LissimpleEliminar {

    Scanner sc= new Scanner (System.in); 
    
    static class Nodo{  //Clase plantilla nodo
        String Name;   //Declaramos string como Name 
        Nodo next;     //Declaramos Nodo como next 
        
    }  
    public static void main(String[] args) { 
        Scanner sc= new Scanner (System.in); 
        int opc; //se declara variable de opcion para el menu
        LissimpleEliminar n= new LissimpleEliminar (); 
        
        do{ //se abre un do while para nuestro menu
           
System.out.println ("\n Menu de opciones :" + "\n 1-Agregar nodo "+ "\n 2-Eliminar nodos" + "\n 3-Mostrar lista" + "\n 4-Salir ");  //menu de opciones
//Menu de opciones
            
            switch (opc = sc.nextInt()){ //Se abre un switch para evaluar lo que elija el usuario de a cuerdo al menu
                
                case 1:  //caso uno Agregar
                    n.Agregar ();  //se manda a traer el metodo agregar de la case Nodo22
                    break; //cierra caso uno
                    
                    
                case 2: //caso dos Eliminar
                    n.Eliminar (); //se manda a traer el metodo eliminar de la clase Nodo22
                    break; //cierra caso dos 
                    
                    
                 case 3: //caso tres Mostrar
                    n.Mostrar (); //se manda a traer el metodo mostrar de la clase Nodo22
                    break; //cierra caso tres  
                    
                    
            }  
        } while (opc != 4);   // se ejecutara la opcion de mennu mientras opc sea diferente de 4
    } Nodo inicial=null; //se declara el nodo inicial que tendra los atributos de nodo: (name)--->dato & (next)--> enlace
    
    
    //METODO PEDIR AL USUARIO AGREGAR UN NODO
    public void Agregar (){ //Se crea el metodo Agregar 
        if (inicial== null) { //Se abre un condicional para saber si hay datos en la lista
            inicial = new Nodo (); //si inicial es nulo entonces
            System.out.println ("Ingrese: "); // se le pide al usuario que ingrese un dato en el nodo
            inicial.Name = sc.nextLine(); //se almacena en el nodo inicial Nombre ya que en Nombre van los datos
        } else {  Nodo post = new Nodo (); //si no se cumple la condicion entonces se almacenara en otro nodo
                  System.out.println ("Ingrese: "); //se pedira al usuario que ingrese un dato en el nodo
                  post.Name = sc.nextLine(); //se almacena en inicial Nombre ya que en Nombre van los datos
                  post.next= inicial; //el nodo nuevo sera igual a inicial 
                  inicial=post; //Entonces post sera ahora Inicial
            }
    }
     
     
    //METODO MOSTRAR LISTA
    public void Mostrar(){ //se crea el metodo Mostrar
        Nodo post = new Nodo (); post=inicial; //En este metodo nodo post ahora sera igual a un nuevo nodo
        if(inicial!= null){ //Si temporal es diferente de null entonces hay datos
        while(post != null){ //Y dado a que post es igual inicial, mientras sea diferente de nulo
            System.out.print(post.Name + "\n"); //se mostrara el dato
            post = post.next; //Por lo que el nodo post señalara al enlace del post siguiente --->
        }
        } else{ System.out.println ("La lista esta vacia");} //Si no, entonces mandara el mensaje 
    }
    
    
     //METODO ELIMINAR NODOS
     public void Eliminar(){ //se crea el metodo Eliminar 
        if(inicial == null){ //Si inicial es igual  a nulo quiere decir que no hay datos en la lista
            System.out.println ("No hay nodos que eliminar"); //mandara mensaje
        } else{ System.out.print("\n Nodo eliminado"); //Si inicial es diferente de nulo quiere decir que si hay datos en la lista y mandara mensaje de que un elemento se ha eliminado
            inicial = inicial.next;} //entonces el que antes era inicial ahora ya no lo sera, si no que lo sera el que le seguia
    }    
}  
