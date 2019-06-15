/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

import java.util.Vector;

/**
 *
 * @author Steven
 */
public class PilaVector {
    
    
    public static final int INICIAL = 19;
    public int cima;
    public Vector listaPila;
    public PilaVector(){
    
        cima = -1;
        listaPila = new Vector(INICIAL);
    
    }
    
    public void insertar(Object elemento)throws Exception{
    
        cima++;
        listaPila.addElement(elemento);
    
    }
    
    public Object quitar()throws Exception{
    
        Object aux;
        
        if (pilavacia()) {
            throw new Exception ("Pila vacia, no se puede extraer");
        }
    
        aux = listaPila.elementAt(cima);
        listaPila.removeElementAt(cima);
        cima--;
        return aux;
  
    }



    public Object cimaPila()throws Exception{
    
        if (pilavacia()) {
            throw new Exception("Pila vacia, no se puede extraer.");
        }
    
        return listaPila.elementAt(cima);

    }
public boolean pilavacia(){


return cima == -1;
}    
    
public void limpiarPila()throws Exception{


    while(! pilavacia())

        quitar();
}

//analizar el codigo de evaluacion de expresiones aritmeticas con pilas
}
