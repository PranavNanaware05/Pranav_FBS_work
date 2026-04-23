package genericLinkedList;

import java.util.Comparator;

public class LinkedList<T> {

    private Node<T> start;
    private int count;

    public LinkedList() {
        start = null;
        count = 0;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public void insert(T x) {
        Node<T> nn = new Node<>(x);

        if (isEmpty()) {
            start = nn;
        } else {
            Node<T> p = start;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(nn);
        }
        count++;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }

        Node<T> p = start;
        while (p != null) {
            System.out.println(p.getData());
            p = p.getNext();
        }
    }

    // Comparator-based Bubble Sort
    public void bubbleSort(Comparator<T> comp) {

        if (isEmpty() || start.getNext() == null) {
            return;
        }

        boolean swapped;

        for (Node<T> i = start; i != null; i = i.getNext()) {

            swapped = false;

            for (Node<T> j = start; j.getNext() != null; j = j.getNext()) {

                if (comp.compare(j.getData(), j.getNext().getData()) > 0) {

                    T temp = j.getData();
                    j.setData(j.getNext().getData());
                    j.getNext().setData(temp);

                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }
}