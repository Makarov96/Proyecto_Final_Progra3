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
public class Nodo {
    
     
   public Object dato;
   public Nodo adelante;
   public Nodo atras;
    
    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }
    
    
public Object getDato(){

return dato;

} 


public Nodo(Object entrada){

    
    dato = entrada;
    adelante = atras = null;
    

}

   public Object getValor() {
        return dato;
    }

  public void setValor(Object valor) {
        this.dato = valor;
    }

    
       public Nodo getSiguiente() {
        return adelante;
    }

    public void setSiguiente(Nodo siguiente) {
        this.adelante = siguiente;
    }  

}