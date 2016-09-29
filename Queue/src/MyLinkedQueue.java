/**
 * Created by Keqin on 29.09.2016.
 */
public class MyLinkedQueue<E> implements Iterable<E> {
    private Cell front, rear;
    private int count;

    public MyLinkedQueue() {
        front = null;
        rear = null;
        count = 0;
    }
    private class Cell {
        private Cell next;
        private E e;

        public Cell(E e, Cell next) {
            this.e = e;
            this.next = next;
        }
    }

    private class MyIterator {

    }

}
