/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEnlazadaNormal;

import java.util.NoSuchElementException;

/**
 *
 * @author Steven
 */
public class ForwardList<T> {
  public ForwardList() {
    head = tail = null;
  }

  public void insertAtHead(T data) {
    Node<T> n = new Node<T>(data, head);
    head = n;
    if (tail == null) {
      tail = n;
    }
  }

  public boolean isEmpty() {
    return head == null;
  }

  public Node<T> findFirst(T data) {
    Node<T> currentNode = head;
    while (currentNode != null) {
      if (currentNode.data == data) {
        return currentNode;
      }
      currentNode = currentNode.next;
    }
    return null;
  }

  public void removeAtHead() {
    if (isEmpty()) {
      throw new NoSuchElementException("List empty! Cannot remove from head!");
    }

    head = head.next;
    if (head == null) {
      tail = null;
    }
  }

  public void removeAtTail() {
    if (isEmpty()) {
      throw new NoSuchElementException("List empty! Cannot remove from tail!");
    }

    if (head == tail) {
      head = tail = null;
      return;
    }

    Node<T> currentNode = head;
    while (currentNode.next != tail) {
      currentNode = currentNode.next;
    }
    currentNode.next = null;
    tail = currentNode;
  }

  public Node<T> head;
  public Node<T> tail;
}