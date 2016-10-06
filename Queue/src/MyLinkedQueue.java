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

    public boolean isEmpty() {
        return front == null;
    }

    public void append(E e) {
        if (rear == null) {
            rear = new Cell(e);
            front = rear;
        } else {
            Cell newCell = new Cell(e, rear);
            newCell.next = newCell;
            rear = newCell;
        }
    }

    public E delete() {
        if (this.front == null) return null;
        E e1 = this.front.e;
        this.front.next = null;
        this.front = this.front.next;
        if (front == null)
            this.rear = null;
        return e1;
    }

    public E peek() throws NoSuchElementException {
        E first = this.front.e;
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return first;
        }
    }

    private class Cell {
        private Cell next;
        private E e;

        public Cell(E e, Cell next) {
            this.e = e;
            this.next = next;
        }

        public Cell(E e) {
            this.e = e;
        }
    }

    private class MyIterator {

    }

}
