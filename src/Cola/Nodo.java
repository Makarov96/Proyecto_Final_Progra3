/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

/**
 *
 * @author David Natareno
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
        return adelante;
    }

    /**
     * @param adelante the adelante to set
     */
    public void setAdelante(Nodo adelante) {
        this.adelante = adelante;
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
        adelante=atras=null;
    }
    public Object dato;
    public Nodo adelante;
    public Nodo atras;
}
