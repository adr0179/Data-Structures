package Doubly;

public class Node<E> {
    Node<E> next;
    Node<E> previous;
    E value;

    public Node(E value) {
        this.next = null;
        this.previous = null;
        this.value = value;
    }

    public E getValue() {
        return this.value;
    }

    public Node<E> getNext() {
        return this.next;
    }

    public Node<E> getPrevious() {
        return this.previous;
    }

    public void setNext(Node<E> node) {
        this.next = node;
    }

    public void setPrevious(Node<E> node) {
        this.previous = node;
    }
}
