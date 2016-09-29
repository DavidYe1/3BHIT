import java.util.Arrays;

/**
 * Erstellen Sie eine Klasse mit Methoden, welche möglichst globale einsetzbare Methoden anbietet. Stellen Sie sicher, dass diese Klasse nicht erweitert bzw. instanziert werden kann.
 * <p/>
 * Folgende Methoden sollten angeboten werden:
 * <p/>
 * public final static <T> T random( T x, T y)
 * <p/>
 * public final static <T> T random( T[] x)
 * <p/>
 * public final static <T extends Number> boolean isOdd (T x)
 * <p/>
 * public final static <T extends Comparable <T>> T min (T a,T b)
 * <p/>
 * public final static <T extends Comparable <T>> T max (T a,T b)
 * <p/>
 * public final static <T extends Comparable <T>> T min (T[] x)
 * <p/>
 * public final static <T extends Comparable <T>> T max (T[] x)
 * <p/>
 * public final static <T extends Comparable <T>> boolean equalTo(T x,T y)
 * <p/>
 * Testen Sie Methoden mit unterschiedlichen Klassen.
 * Fangen Sie die Exceptions in der Testklasse ab!
 * <p/>
 * Geben Sie das Beispiel entsprechend der Abgaberichtlinie ab.
 * <p/>
 * Viel Erfolg
 * Created by @Autor david ye on @version 22.09.2016.
 */

class Utility {
    /**
     * @param x   generic value
     * @param y   generic value
     * @param <T>
     * @return wenn die zufallszahl größer ist als die hälfte gibt es a zurück ander falls b
     * wählt zuffälig zwischen 2 zahlen
     */
    public final static <T> T random(T x, T y) {
        return Math.random() > 0.5 ? x : y;
    }

    /**
     * @param a   generic value
     * @param b   generic value
     * @param <T> generic datatype
     * @return gibt den größeren param zurück
     */
    public final static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    /**
     * @param a   generic value
     * @param b   generic value
     * @param <T> generic datatype
     * @return gibt den kleineren param zurück
     */
    public final static <T extends Comparable<T>> T min(T a, T b) {
        return a.compareTo(b) < 0 ? a : b;
    }

    /**
     * @param a   generic value
     * @param b   generic value
     * @param <T> generic datatype
     * @return gibt true zurück wenn a=b, ander falls false
     */
    public final static <T extends Comparable<T>> boolean equalTo(T a, T b) {
        return a.equals(b);
    }

    /**
     * @param x   generic value
     * @param <T> generic datatype
     * @return gibt ein zufälliges element eines Arrays zurück
     */
    public final static <T> T random(T[] x) {
        if (x == null || x.length == 0) throw new NullPointerException();

        int i = (int) (Math.random() * x.length);
        return x[i];
    }

    /**
     * @param x   generic value
     * @param <T> generic datatype
     * @return gibt das element, mit dem kleinsten wert, eines Arrays zurück
     */
    public final static <T extends Comparable<T>> T min(T[] x) {
        Arrays.sort(x);
        if (x == null || x.length == 0) throw new NullPointerException();
        return x[0];
    }

    /**
     * @param x   generic value
     * @param <T> generic datatype
     * @return gibt das element, mit dem groesten wert, eines Arrays zurück
     */
    public final static <T extends Comparable<T>> T max(T[] x) {
        Arrays.sort(x);
        if (x == null || x.length == 0) throw new NullPointerException();
        return x[x.length - 1];
    }

    /**
     * @param x   generic value
     * @param <T> generic datatype
     * @return gibt true zurueck wenn der param ungerade ist
     */
    public final static <T extends Number> boolean isOdd(T x) {
        return x.longValue() % 2 != 0;
    }

}
