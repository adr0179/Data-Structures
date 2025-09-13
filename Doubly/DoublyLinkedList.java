package Doubly;

public class DoublyLinkedList<E> {
    Node<E> head;
    int size;

    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(E val) {
        if (this.size == 0) {
            this.head = new Node<E>(val);
            this.size++;
            return;
        }

        Node<E> cur = this.head;
        while (cur.getNext() != null) {
            cur = cur.getNext();
        }

        cur.setNext(new Node<E>(val));
        cur.getNext().setPrevious(cur);
        this.size++;
    }

    public E remove(E val) {
        Node<E> cur = this.head;

        if (this.size == 1) {
            this.head = null;
            size--;
            return val;
        } else if (this.head.getValue() == val) {
            this.head = this.head.getNext();
            this.head.setPrevious(null);
            size--;
            return val;
        }

        while (cur.getNext().getValue() != null) {
            if (cur.getNext().getValue() == val) {
                cur.setNext(cur.getNext().getNext());
                cur.setPrevious(cur); 
                size--;
                return val;
            }
            cur = cur.getNext();
        }

        return null;
    }

    public void clear() {
        this.head = null;
    }

    public String toString() {
        Node<E> cur = this.head;
        if (cur == null) {
            return "[]";
        }

        String print = "[";
        while (cur.getNext() != null) {
            print += cur.getValue() + ", ";
            cur = cur.getNext();
            if (cur.getNext() == null) {
                print += cur.getValue() +"]";
                return print;
            }
        }

        return null;
    }

    public E previous(E val) {
        Node<E> cur = this.head;

        if (this.head.getValue() == val) {
            return null;
        }
        
        while (cur.getValue() != val) {
            cur = cur.getNext();
        }

        return cur.getPrevious().getValue();
    }

    public int getSize() {
        return this.size;
    }
}