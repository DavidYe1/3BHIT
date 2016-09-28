import java.util.Random;

/**
 * testet alle Utility methoden die arrays verwenden
 * Created by @Autor david ye on @version 28.09.2016.
 */
public class IntArrayTest {
    private static int[] testArray1 = new int[10]; //10 stelliges array erstellen

    public static void main(String[] args) {
        randomFill(testArray1);// array füllen
        System.out.print(Utility.max(testArray1));
    }/**
     Fehler
     method Utility.<T>random(T[]) is not applicable
     (inferred type does not conform to upper bound(s)
     inferred: int
     upper bound(s): java.lang.Object)
     */
    /**
     * Erstellt random zahlen und füllt ein array damit
     *
     * @param ar1
     */
    public static void randomFill(int[] ar1) {
        Random r = new Random();
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = r.nextInt(100);
            System.out.print(ar1[i] + "  ");
        }
    }
}
