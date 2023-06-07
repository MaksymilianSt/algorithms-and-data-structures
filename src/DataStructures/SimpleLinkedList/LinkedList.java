package DataStructures.SimpleLinkedList;

public class LinkedList<E> {
    Node head;

    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }


    public void add(E element) {
        if (head == null) {
            head = new Node(element);
            return;
        }
        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new Node(element);
    }

    public boolean contains(E element) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(element)) return true;
            current = current.next;
        }
        return false;
    }

    public E get(int index) {
        Node current = head;
        int i = 0;
        while (current != null) {
            if (i++ == index) return current.data;
            current = current.next;
        }
        return null;
    }

    private class Node {
        private E data;
        private Node next;

        private Node(E data) {
            this.data = data;
        }
    }
}
