import static java.util.Arrays.sort;

/**
 * Created by @Autor david ye on @version 22.09.2016.
 */

public class Utility {
    /**
     * @param x
     * @param y
     * @param <T>
     * @return wenn die zufallszahl größer ist als die hälfte gibt es a zurück ander falls b
     * wählt zuffälig zwischen 2 zahlen
     */
    public final static <T> T random(T x, T y) {
        return Math.random() > 0.5 ? x : y;
    }

    /**
     * @param a
     * @param b
     * @param <T>
     * @return gibt den größeren param zurück
     */
    public final static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    /**
     * @param a
     * @param b
     * @param <T>
     * @return gibt den kleineren param zurück
     */
    public final static <T extends Comparable<T>> T min(T a, T b) {
        return a.compareTo(b) < 0 ? a : b;
    }

    /**
     * @param a
     * @param b
     * @param <T>
     * @return gibt true zurück wenn a=b, ander falls false
     */
    public final static <T extends Comparable<T>> boolean equalTo(T a, T b) {
        return a.equals(b) ? true : false;
    }

    /**
     * @param x
     * @param <T>
     * @return gibt ein zufälliges element eines Arrays zurück
     */
    public final static <T> T random(T[] x) {
        if (x == null || x.length == 0) throw new NullPointerException();

        int i = (int) (Math.random() * x.length);
        return x[i];
    }

    /**
     * @param x
     * @param <T>
     * @return gibt das element, mit dem kleinsten wert, eines Arrays zurück
     */
    public final static <T extends Comparable<T>> T min(T[] x) {
        sort(x);
        if (x == null || x.length == 0) throw new NullPointerException();
        return x[0];
    }

    /**
     * @param x
     * @param <T>
     * @return gibt das element, mit dem groesten wert, eines Arrays zurück
     */
    public final static <T extends Comparable<T>> T max(T[] x) {
        sort(x);
        if (x == null || x.length == 0) throw new NullPointerException();
        return x[x.length];
    }

    /**
     * @param x
     * @param <T>
     * @return gibt true zurueck wenn der param ungerade ist
     */
    public final static <T extends Number> boolean isOdd(T x) {
        if (x.longValue() % 2 != 0) return true;
        else return false;
    }

}
