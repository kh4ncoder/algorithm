package linkedlist;

import java.util.NoSuchElementException;

public class SingleLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;

    public SingleLinkedList() {
        head = null;
        tail = null;
    }

    public void add(E value) {
        Node<E> node = new Node<>(value);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    public void insert(Integer index, E value) {
        int count = this.length();
        if (index < 0 || index > count) {
            throw new IllegalArgumentException();
        } else if (index == 0) {
            addFirst(value);
        } else if (index == count) {
            addLast(value);
        } else {
            Node<E> it = head;
            Node<E> node = new Node<>(value);
            for (int i = 0; i < index - 1; i++) {
                it = it.getNext();
            }
            node.setNext(it.getNext());
            it.setNext(node);
        }
    }

    public void addFirst(E value) {
        Node<E> node = new Node<>(value);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    public void addLast(E value) {
        Node<E> node = new Node<>(value);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    public E remove() {
        return removeFirst();
    }

    public E removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        E value = head.getValue();
        if (head.hasNext()) {
            head = head.getNext();
        } else {
            head = null;
            tail = null;
        }
        return value;
    }

    public E removeLast() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Node<E> it = head;
        E value = it.getValue();
        if (!it.hasNext()) {
            head = null;
            tail = null;
            return value;
        }
        while (it.hasNext()) {
            Node<E> nt = it.getNext();
            if (nt.equals(tail)) {
                it.setNext(null);
                tail = it;
                value = nt.getValue();
            } else {
                it = it.getNext();
            }
        }
        return value;
    }

    public void clear() {
        head = null;
        tail = null;
    }

    public boolean contains(E e) {
        if (head == null) {
            return false;
        }
        Node<E> it = head;
        if (!it.hasNext()) {
            return it.getValue() == e;
        }
        while (it.hasNext()) {
            if (it.getValue() == e) {
                return true;
            }
            it = it.getNext();
        }
        return false;
    }

    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 1;
        Node<E> it = head;
        while (it.hasNext()) {
            count++;
            it = it.getNext();
        }
        return count;
    }


    @Override
    public String toString(){
        if (head == null) {
            return "SingleLinkedList[]";
        }
        Node it = head;
        StringBuilder builder = new StringBuilder();
        builder.append("SingleLinkedList[");
        while (it.hasNext()) {
            builder.append(it.getValue() + " ");
            it = it.getNext();
        }
        builder.append(it.getValue() + "]");
        return builder.toString();
    }
}
