/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDoblementeEnlazada;

/**
 *
 * @author Steven
 */
public class ListaDoble {
    
   
    public Nodo cabeza;
    private int tamanio;
    
    public ListaDoble(){
    
        cabeza = null;
    
        tamanio =0;
    }
      public int getTamanio(){
        return tamanio;
    }
    
    public ListaDoble insertarCabezaLista(Object entrada){
    
        Nodo nuevo;
        nuevo = new Nodo(entrada);
    
        nuevo.adelante = cabeza;
        
        if (cabeza != null) 
            
            cabeza.atras = nuevo;
            
            cabeza = nuevo;
        return this ;
        
        
    }
    

    
    public ListaDoble insertaDespues(Nodo anterior,Object entrada){
        Nodo nuevo;
        nuevo=new Nodo(entrada);
        nuevo.adelante=anterior.adelante;
        if(anterior.adelante != null){
            anterior.adelante.atras=nuevo;
        }
        anterior.adelante=nuevo;
        nuevo.atras=anterior;
        return this;
    }
    
    public void eliminar(int entrada) {
        Nodo actual;
        boolean encontrado = false;
        actual = cabeza;

        while ((actual != null) && (!encontrado)) {
            encontrado = (actual.dato.equals(entrada));
            if (!encontrado) {
                actual = actual.adelante;
            }
        }

        if (actual != null) {
            if (actual == cabeza) {
                cabeza = actual.adelante;
                if (actual.adelante != null) {
                    actual.adelante.atras = null;
                }
            } else if (actual.adelante != null) {
                actual.atras.adelante = actual.adelante;
                actual.adelante.atras = actual.atras;
            } else {
                actual.atras.adelante = null;
            }
            actual = null;
        }
    }
     public boolean buscar(int referencia){
        // Crea una copia de la lista.
        Nodo aux = cabeza;
         
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.
        while(aux != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            
            if (aux.dato.equals(referencia)){
                // Canbia el valor de la bandera.
                encontrado = true;
          
            }
            else{
                // Avansa al siguiente. nodo.
                aux = aux.adelante;
            }
        }
             
          return encontrado;
     }
    
    
     public void insertarEnPosicion(Object v,int pos) {
        
        int cont = 1;
        Nodo auxiliar = cabeza;
        while (auxiliar.adelante != cabeza) {
            if (cont == pos -1) {
                Nodo nuevo = new Nodo(v);//Se crea un espacio en memoria para el nodo inicio
                nuevo.dato = v;// se inserta el dato
                Nodo auxiliar2 = auxiliar.adelante;
                auxiliar.adelante = nuevo;
                nuevo.atras = auxiliar;
                nuevo.adelante = auxiliar2;
                auxiliar2.atras = nuevo;
                tamanio++;
                break;
            }

            cont++;
            auxiliar = auxiliar.adelante;
        }
    }
     
     
    public void visualizar(){
    
        Nodo n;
        n = cabeza;
        while(n != null){
        
            System.out.println(n.dato);
            n = n.adelante;
        }
    
    }
    

    
}
