package lissimple.eliminar; //Sergio DAneil Martinez Toral 

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
                    n.Agregar ();  
                    break; 
                    
                    
                case 2: //caso dos Eliminar
                    n.Eliminar (); 
                    break; //cierra caso dos 
                    
                    
                 case 3: //caso tres Mostrar
                    n.Mostrar (); 
                    break; //cierra caso tres  
                    
                    
            }  
        } while (opc != 4);   // se ejecutara la opcion de mennu mientras opc sea diferente de 4
    } Nodo inicial=null; //se declara el nodo inicial que tendra los atributos de nodo: (name)--->dato & (next)--> enlace
    
    
    //METODO PEDIR AL USUARIO AGREGAR UN NODO
    public void Agregar (){ //Se crea el metodo Agregar 
        if (inicial== null) {
            inicial = new Nodo (); //si inicial es nulo entonces
            System.out.println ("Ingrese: "); /
            inicial.Name = sc.nextLine(); //se almacena en el nodo inicial Nombre ya que en Nombre van los datos
        } else {  Nodo post = new Nodo (); 
                  System.out.println ("Ingrese: "); 
                  post.Name = sc.nextLine(); 
                  post.next= inicial; 
                  inicial=post; 
            }
    }
     
     
    //METODO MOSTRAR LISTA
    public void Mostrar(){ //se crea el metodo Mostrar
        Nodo post = new Nodo (); post=inicial; 
        if(inicial!= null){ //Si temporal es diferente de null entonces hay datos
        while(post != null){ //Y dado a que post es igual inicial, mientras sea diferente de nulo
            System.out.print(post.Name + "\n"); 
            post = post.next; 
        }
        } else{ System.out.println ("La lista esta vacia");} //Si no, entonces mandara el mensaje 
    }
    
    
     //METODO ELIMINAR NODOS
     public void Eliminar(){ 
        if(inicial == null){ 
            System.out.println ("No hay nodos que eliminar"); //mandara mensaje
        } else{ System.out.print("\n Nodo eliminado"); //Si inicial es diferente de nulo quiere decir que si hay datos en la lista y mandara mensaje de que un elemento se ha eliminado
            inicial = inicial.next;} 
    }    
}  
