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
public class ListaCircular2 {
  
    public Nodo lc;

    public ListaCircular2() {

        lc = null;

    }

    public ListaCircular2 insertar(Object entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        if (lc != null) {

            nuevo.enlace = lc.enlace;
            lc.enlace = nuevo;

        }
        lc = nuevo;
        return this;

    }

    public void eliminiar(Object entrada) {
        Nodo actual;
        boolean encontrado = false;
        actual = lc;

        while ((actual.enlace != lc) && (!encontrado)) {

            encontrado = (actual.enlace.dato.equals(entrada));
            if (!encontrado) {
                actual = actual.enlace;
            }
        }

        encontrado = (actual.enlace.dato.equals(entrada));

        encontrado = (actual.enlace.dato.equals(entrada));
        // Enlace de nodo anterior con el siguiente
        if (encontrado) {
            Nodo p;
            p = actual.enlace;//Nodo a eliminar
            if (lc == lc.enlace) {
                lc = null;
            } else {
                if (p == lc) {
                    lc = actual;//se borra el elemento referenciado or lc 
                    //el nuevo aceso a la lista es el anterior
                }
                actual.enlace = p.enlace;
            }
            p = null;
        }
    }

    public void recorrer() {

        Nodo p;
        if (lc != null) {
            p = lc.enlace; // siguiente nodo al de acceso
            do {
                System.out.println("\t" + p.dato);
                p = p.enlace;

            } while (p != lc.enlace);
        } else {
            System.out.println("\t Lista Circular vacía.");
        }

    }
    
    public void borrarLista(){
    
    Nodo p ;
            if (lc != null) {
                p= lc;
                do{
                Nodo t;
                t = p;
                p= p.enlace;
                t = null;
                }while(p!=lc);
            }else{
            
                System.out.println("Lista VAcia");
            
            }
       lc  = null;
    
    }
    
}
