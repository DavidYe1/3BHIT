import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Keqin on 29.09.2016.
 */
public class MyLinkedQueue<E> implements Iterable<E> {
    private Cell front, rear;
    private int count;

    /**
     * Constructor
     */
    public MyLinkedQueue() {
        front = null;
        rear = null;
        count = 0;
    }

    /**
     * Überprüft ob die queue leer ist
     *
     * @return true wenn leer. false bei nicht leer.
     */
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * fügt ein element am ende hinzu
     * @param e the queue
     */
    public void append(E e) {
        if (rear == null) {
            count++;
            rear = new Cell(e);
            front = rear;
        } else {
            count++;
            Cell newCell = new Cell(e, rear);
            newCell.next = newCell;
            rear = newCell;
        }
    }

    /**
     * löscht das erste element.
     * @return the queue
     */
    public E delete() {
        if (this.front == null) return null;
        count--;
        E e1 = this.front.e;
        this.front.next = null;
        this.front = this.front.next;
        if (front == null)
            this.rear = null;
        return e1;
    }

    /**
     * schaut auf das erste element
     * @return das erste element
     * @throws NoSuchElementException
     */
    public E peek() throws NoSuchElementException {
        E first = this.front.e;
        if (isEmpty()) {
            throw new NoSuchElementException("Erstes Element ist leer.");
        } else {
            return first;
        }
    }

    /**
     * schaut das letzte element an.
     *
     * @return das letzte element
     * @throws NoSuchElementException
     */
    public E peeklast() throws NoSuchElementException {
        E last = this.rear.e;
        if (isEmpty()) {
            throw new NoSuchElementException("Letztes Element ist leer.");
        } else {
            return last;
        }
    }

    /**
     * gibt die größe des queues zurück
     *
     * @return queuegröße
     */
    public int size() {
        return count;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    /**
     * Cell klasse
     */
    private class Cell {    //Fehler: Exception in thread "main" java.lang.NullPointerException at MyLinkedQueue$Cell.access$000(MyLinkedQueue.java:107)
        private Cell next;
        private E e;

        /**
         * Constructor
         *
         * @param e     das Objekt
         * @param next  das nächste element
         */
        public Cell(E e, Cell next) {
            this.e = e;
            this.next = next;
        }

        /**
         * Konstruktor
         *
         * @param e
         */
        public Cell(E e) {
            this.e = e;
        }
    }

    private class MyIterator implements Iterator<E> {
        private Cell pointer;
        private boolean begin;
        private boolean removeable;

        /**
         * Konstruktor
         */
        public MyIterator() {
            begin = true;
            removeable = false;
            pointer = null;
        }

        @Override
        public boolean hasNext() { // Exception in thread "main" java.lang.NullPointerException at MyLinkedQueue$MyIterator.next(MyLinkedQueue.java:145)
            return removeable = true;
        }

        @Override
        public E next() {
            if (!hasNext()) throw new NoSuchElementException("Error");
            pointer = pointer.next;
            return pointer.e;
        }

        @Override
        public void remove() {
            //if(pointer.e)throw new IllegalStateException("Error");
            delete();
        }
    }

}
