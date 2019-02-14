package linkedlist;

import java.util.NoSuchElementException;

public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        if (next == null) {
            throw new NoSuchElementException();
        }
        return next;
    }

    public void setNext(Node<T> node) {
        next = node;
    }

    public boolean hasNext() {
        return next != null;
    }
}
