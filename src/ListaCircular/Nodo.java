/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaCircular;

/**
 *
 * @author Steven
 */
public class Nodo {
       /**
     * @return the dato
     */
    public Object getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Object dato) {
        this.dato = dato;
    }

    /**
     * @return the adelante
     */
    public Nodo getAdelante() {
        return enlace;
    }

    /**
     * @param adelante the adelante to set
     */
    public void setAdelante(Nodo adelante) {
        this.enlace = adelante;
    }

    /**
     * @return the atras
     */
    public Nodo getAtras() {
        return atras;
    }

    /**
     * @param atras the atras to set
     */
    public void setAtras(Nodo atras) {
        this.atras = atras;
    }
    
    public Nodo(Object entrada){
        dato=entrada;
        enlace = this;
    }
    public Object dato;
    public Nodo enlace;
    public Nodo atras;
}
