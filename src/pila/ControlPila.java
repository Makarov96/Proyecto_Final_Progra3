/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

import Cola.cola;
import java.util.Queue;
import java.util.Stack;
import Pila.PilaVector;

/**
 *
 * @author StevenColocho
 */
public class ControlPila {
    public static void separar(cola s, String str){
        for (int i = 0; i < str.length(); i++) {
            s.insertar(str.charAt(i));
        }
    }
    
 
    
    public static void separar1(Pila.PilaVector s, String str) throws Exception{
        for (int i = 0; i < str.length(); i++) {
            s.insertar(str.charAt(i));
        }
    }
    
    public static boolean estanBienCerrados(PilaVector s, cola q) throws Exception{
        int pAbierto = 0,  pCerrado= 0;
        int llAbierto = 0, llCerrado = 0;
        int cAbierto = 0, cCerrado = 0;
        while (!q.colaVacia()){
            Character open =(char) q.extraer();
            Character close =(char) s.quitar();
            if (open.equals('(')) {
                pAbierto++;
            }
            if (close.equals(')')) {
                pCerrado++;
            }
            if (open.equals('[')) {
                llAbierto++;
            }
            if (close.equals(']')) {
                llCerrado++;
            }
            if (open.equals('{')) {
                cAbierto++;
            }
            if (close.equals('}')) {
                cCerrado++;
            }
        }
        //System.err.println("Abierto: "+pAbierto+" Cerrado: "+pCerrado);
        return (pAbierto == pCerrado) && (cCerrado == cAbierto) && (llAbierto == llCerrado);
    }
    
}
