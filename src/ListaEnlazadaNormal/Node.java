/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEnlazadaNormal;

/**
 *
 * @author Steven
 */
public class Node<T> {

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

   public T data;
   public Node<T> next;
}
