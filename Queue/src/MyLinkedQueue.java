/**
 * Created by Keqin on 29.09.2016.
 */
public class MyLinkedQueue<E> implements Iterable<E> {

    private class Cell {
        private Cell next;
        private E e;

        public Cell(E e, Cell next) {
            this.e = e;
            this.next = next;
        }
    }

}
